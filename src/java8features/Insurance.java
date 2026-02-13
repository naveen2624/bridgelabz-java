package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Insurance {

    // Policy Class
    static class Policy {
        private String policyNumber;
        private String holderName;
        private double premiumAmount;

        public Policy(String policyNumber, String holderName, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.holderName = holderName;
            this.premiumAmount = premiumAmount;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public String getHolderName() {
            return holderName;
        }

        public double getPremiumAmount() {
            return premiumAmount;
        }

        @Override
        public String toString() {
            return String.format("PolicyNumber: %s | Holder: %s | Premium: $%.2f",
                    policyNumber, holderName, premiumAmount);
        }
    }

    public static void main(String[] args) {

        List<Policy> policies = Arrays.asList(
                new Policy("P101", "Alice Smith", 1500),
                new Policy("P102", "Bob Johnson", 900),
                new Policy("P103", "Charlie Smith", 2200),
                new Policy("P104", "David Brown", 1800),
                new Policy("P105", "Emily Davis", 1200),
                new Policy("P106", "Frank Miller", 2500),
                new Policy("P107", "George Wilson", 700)
        );

        // 1️⃣ Filter Policies by Premium > 1200
        System.out.println("\n1. Premium > 1200:");
        policies.stream()
                .filter(p -> p.getPremiumAmount() > 1200)
                .forEach(System.out::println);

        // 2️⃣ Sort Policies by Holder Name
        System.out.println("\n2. Sorted by Holder Name:");
        policies.stream()
                .sorted((p1, p2) -> p1.getHolderName().compareTo(p2.getHolderName()))
                .forEach(System.out::println);

        // 3️⃣ Compute Total Premium
        double totalPremium = policies.stream()
                .mapToDouble(Policy::getPremiumAmount)
                .sum();
        System.out.println("\n3. Total Premium: $" + totalPremium);

        // 4️⃣ Print Policy Details
        System.out.println("\n4. All Policy Details:");
        policies.forEach(p -> System.out.println(p));

        // 5️⃣ Filter Premium between 1000 and 2000
        System.out.println("\n5. Premium between 1000 and 2000:");
        policies.stream()
                .filter(p -> p.getPremiumAmount() >= 1000 && p.getPremiumAmount() <= 2000)
                .forEach(System.out::println);

        // 6️⃣ Policy with Highest Premium
        System.out.println("\n6. Highest Premium Policy:");
        policies.stream()
                .max(Comparator.comparingDouble(Policy::getPremiumAmount))
                .ifPresent(System.out::println);

        // 7️⃣ Group by Holder Name Initial
        System.out.println("\n7. Grouped by Holder Name Initial:");
        Map<Character, List<Policy>> grouped =
                policies.stream()
                        .collect(Collectors.groupingBy(
                                p -> p.getHolderName().charAt(0)
                        ));
        grouped.forEach((k, v) -> {
            System.out.println("Initial: " + k);
            v.forEach(System.out::println);
        });

        // 8️⃣ Average Premium
        double avgPremium = policies.stream()
                .mapToDouble(Policy::getPremiumAmount)
                .average()
                .orElse(0);
        System.out.println("\n8. Average Premium: $" + avgPremium);

        // 9️⃣ Sort by Premium Ascending
        System.out.println("\n9. Sorted by Premium (Ascending):");
        policies.stream()
                .sorted(Comparator.comparingDouble(Policy::getPremiumAmount))
                .forEach(System.out::println);

        // 🔟 Check Any Policy > 2000
        boolean anyHighPremium = policies.stream()
                .anyMatch(p -> p.getPremiumAmount() > 2000);
        System.out.println("\n10. Any Premium > 2000? " + anyHighPremium);

        // 1️⃣1️⃣ Count Policies by Premium Range
        System.out.println("\n11. Count by Premium Range:");
        Map<String, Long> premiumRanges = policies.stream()
                .collect(Collectors.groupingBy(p -> {
                    if (p.getPremiumAmount() <= 1000) return "0-1000";
                    else if (p.getPremiumAmount() <= 2000) return "1001-2000";
                    else return ">2000";
                }, Collectors.counting()));
        premiumRanges.forEach((k, v) -> System.out.println(k + ": " + v));

        // 1️⃣2️⃣ Extract Unique Holder Names
        System.out.println("\n12. Unique Holder Names:");
        policies.stream()
                .map(Policy::getHolderName)
                .distinct()
                .forEach(System.out::println);

        // 1️⃣3️⃣ Find Policies by Holder Name Substring "Smith"
        System.out.println("\n13. Holder Name contains 'Smith':");
        policies.stream()
                .filter(p -> p.getHolderName().contains("Smith"))
                .forEach(System.out::println);

        // 1️⃣4️⃣ Map Policy Number to Premium
        System.out.println("\n14. Map of Policy Number -> Premium:");
        Map<String, Double> policyMap =
                policies.stream()
                        .collect(Collectors.toMap(
                                Policy::getPolicyNumber,
                                Policy::getPremiumAmount
                        ));
        policyMap.forEach((k, v) -> System.out.println(k + " : $" + v));

        // 1️⃣5️⃣ Most Frequent Words in Text Corpus
        System.out.println("\n15. Top 3 Frequent Words:");
        String text = "Java is powerful and Java is popular and Java is widely used";

        Map<String, Long> wordFrequency =
                Arrays.stream(text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+"))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        wordFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // 1️⃣6️⃣ Second Most Repeated Word
        System.out.println("\n16. Second Most Repeated Word:");
        wordFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .ifPresent(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
