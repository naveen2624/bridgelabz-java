package java8features;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyRiskAssessment {

    static class PolicyHolder {
        private String holderId;
        private String name;
        private int age;
        private String policyType;
        private double premiumAmount;

        public PolicyHolder(String holderId, String name,
                            int age, String policyType, double premiumAmount) {
            this.holderId = holderId;
            this.name = name;
            this.age = age;
            this.policyType = policyType;
            this.premiumAmount = premiumAmount;
        }

        public String getHolderId() { return holderId; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getPolicyType() { return policyType; }
        public double getPremiumAmount() { return premiumAmount; }
    }

    static class RiskAssessment {
        private String holderId;
        private String name;
        private double riskScore;

        public RiskAssessment(String holderId, String name, double riskScore) {
            this.holderId = holderId;
            this.name = name;
            this.riskScore = riskScore;
        }

        public double getRiskScore() { return riskScore; }

        @Override
        public String toString() {
            return holderId + " | " + name + " | Risk Score: " + riskScore;
        }
    }

    public static void main(String[] args) {

        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder("H1", "Alice", 65, "Life", 40000),
                new PolicyHolder("H2", "Bob", 55, "Life", 20000),
                new PolicyHolder("H3", "Charlie", 70, "Life", 50000),
                new PolicyHolder("H4", "David", 45, "Health", 15000)
        );

        // 1️⃣ Filter: Life policy & age > 60
        List<PolicyHolder> filtered = holders.stream()
                .filter(h -> h.getPolicyType().equals("Life") && h.getAge() > 60)
                .collect(Collectors.toList());

        // 2️⃣ Transform: Calculate riskScore = premiumAmount / age
        List<RiskAssessment> riskList = filtered.stream()
                .map(h -> new RiskAssessment(
                        h.getHolderId(),
                        h.getName(),
                        h.getPremiumAmount() / h.getAge()))
                .collect(Collectors.toList());

        // 3️⃣ Sort by riskScore descending
        List<RiskAssessment> sortedRisks = riskList.stream()
                .sorted(Comparator.comparingDouble(RiskAssessment::getRiskScore)
                        .reversed())
                .collect(Collectors.toList());

        // 4️⃣ Categorize into High Risk / Low Risk
        Map<String, List<RiskAssessment>> categorized =
                sortedRisks.stream()
                        .collect(Collectors.groupingBy(r ->
                                r.getRiskScore() > 0.5 ?
                                        "High Risk" : "Low Risk"));

        System.out.println("Risk Categories:");
        categorized.forEach((category, list) -> {
            System.out.println("\n" + category);
            list.forEach(System.out::println);
        });
    }
}
