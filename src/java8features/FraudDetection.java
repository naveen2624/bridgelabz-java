package java8features;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FraudDetection {

    static class Transaction {
        private String transactionId;
        private String policyNumber;
        private double amount;
        private LocalDate transactionDate;
        private boolean isFraudulent;

        public Transaction(String transactionId, String policyNumber,
                           double amount, LocalDate transactionDate,
                           boolean isFraudulent) {
            this.transactionId = transactionId;
            this.policyNumber = policyNumber;
            this.amount = amount;
            this.transactionDate = transactionDate;
            this.isFraudulent = isFraudulent;
        }

        public String getPolicyNumber() { return policyNumber; }
        public double getAmount() { return amount; }
        public boolean isFraudulent() { return isFraudulent; }
    }

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", "P101", 15000, LocalDate.now(), true),
                new Transaction("T2", "P101", 20000, LocalDate.now(), true),
                new Transaction("T3", "P101", 8000, LocalDate.now(), true),
                new Transaction("T4", "P102", 60000, LocalDate.now(), true),
                new Transaction("T5", "P102", 12000, LocalDate.now(), true),
                new Transaction("T6", "P103", 5000, LocalDate.now(), false)
        );

        // 1️⃣ Filter fraudulent & amount > 10000
        List<Transaction> frauds = transactions.stream()
                .filter(t -> t.isFraudulent() && t.getAmount() > 10000)
                .collect(Collectors.toList());

        // 2️⃣ Group by policyNumber
        Map<String, List<Transaction>> grouped =
                frauds.stream()
                        .collect(Collectors.groupingBy(Transaction::getPolicyNumber));

        // 3️⃣ Aggregate: count & total fraud amount
        Map<String, DoubleSummaryStatistics> stats =
                frauds.stream()
                        .collect(Collectors.groupingBy(
                                Transaction::getPolicyNumber,
                                Collectors.summarizingDouble(Transaction::getAmount)
                        ));

        // 4️⃣ Generate Alerts
        System.out.println("Fraud Alerts:");
        stats.forEach((policy, summary) -> {
            if (summary.getCount() > 5 || summary.getSum() > 50000) {
                System.out.println("ALERT: Policy " + policy +
                        " | Fraud Count: " + summary.getCount() +
                        " | Total Fraud Amount: $" + summary.getSum());
            }
        });
    }
}
