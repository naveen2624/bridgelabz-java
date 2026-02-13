package java8features;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ClaimsAnalysis {

    static class Claim {
        private String claimId;
        private String policyNumber;
        private double claimAmount;
        private LocalDate claimDate;
        private String status;

        public Claim(String claimId, String policyNumber,
                     double claimAmount, LocalDate claimDate, String status) {
            this.claimId = claimId;
            this.policyNumber = policyNumber;
            this.claimAmount = claimAmount;
            this.claimDate = claimDate;
            this.status = status;
        }

        public String getPolicyNumber() { return policyNumber; }
        public double getClaimAmount() { return claimAmount; }
        public String getStatus() { return status; }
    }

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("C1", "P101", 7000, LocalDate.now(), "Approved"),
                new Claim("C2", "P101", 3000, LocalDate.now(), "Rejected"),
                new Claim("C3", "P102", 12000, LocalDate.now(), "Approved"),
                new Claim("C4", "P103", 8000, LocalDate.now(), "Approved"),
                new Claim("C5", "P102", 6000, LocalDate.now(), "Approved"),
                new Claim("C6", "P104", 2000, LocalDate.now(), "Approved")
        );

        // 1️⃣ Filter: Approved & claimAmount > 5000
        List<Claim> filteredClaims = claims.stream()
                .filter(c -> c.getStatus().equals("Approved") && c.getClaimAmount() > 5000)
                .collect(Collectors.toList());

        // 2️⃣ Group by policyNumber
        Map<String, List<Claim>> grouped = filteredClaims.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber));

        // 3️⃣ Aggregate: total & average claimAmount per policy
        Map<String, DoubleSummaryStatistics> stats =
                filteredClaims.stream()
                        .collect(Collectors.groupingBy(
                                Claim::getPolicyNumber,
                                Collectors.summarizingDouble(Claim::getClaimAmount)
                        ));

        System.out.println("Policy-wise Claim Statistics:");
        stats.forEach((policy, summary) -> {
            System.out.println(policy +
                    " | Total: $" + summary.getSum() +
                    " | Avg: $" + summary.getAverage());
        });

        // 4️⃣ Top 3 policies by highest total claimAmount
        System.out.println("\nTop 3 Policies by Total Claims:");
        stats.entrySet().stream()
                .sorted((e1, e2) ->
                        Double.compare(e2.getValue().getSum(),
                                e1.getValue().getSum()))
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() +
                                " | Total: $" + e.getValue().getSum()));
    }
}
