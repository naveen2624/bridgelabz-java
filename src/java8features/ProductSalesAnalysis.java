package java8features;

import java.util.*;
import java.util.stream.Collectors;

public class ProductSalesAnalysis {

    // Sale Class
    static class Sale {
        private String productId;
        private int quantity;
        private double price;

        public Sale(String productId, int quantity, double price) {
            this.productId = productId;
            this.quantity = quantity;
            this.price = price;
        }

        public String getProductId() { return productId; }
        public int getQuantity() { return quantity; }
        public double getPrice() { return price; }
    }

    // ProductSales Class (Transformed Object)
    static class ProductSales {
        private String productId;
        private double totalRevenue;

        public ProductSales(String productId, double totalRevenue) {
            this.productId = productId;
            this.totalRevenue = totalRevenue;
        }

        public String getProductId() { return productId; }
        public double getTotalRevenue() { return totalRevenue; }

        @Override
        public String toString() {
            return "ProductId: " + productId + " | Revenue: $" + totalRevenue;
        }
    }

    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale("P101", 15, 20),
                new Sale("P102", 8, 50),
                new Sale("P103", 25, 30),
                new Sale("P104", 12, 40),
                new Sale("P105", 5, 100),
                new Sale("P106", 18, 60),
                new Sale("P107", 30, 10)
        );

        // 1️⃣ Filter: quantity > 10
        List<Sale> filteredSales = sales.stream()
                .filter(s -> s.getQuantity() > 10)
                .collect(Collectors.toList());

        // 2️⃣ Transform: Create ProductSales (productId + total revenue)
        List<ProductSales> productRevenue = filteredSales.stream()
                .map(s -> new ProductSales(
                        s.getProductId(),
                        s.getQuantity() * s.getPrice()))
                .collect(Collectors.toList());

        // 3️⃣ Sort by total revenue descending
        List<ProductSales> sortedProducts = productRevenue.stream()
                .sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed())
                .collect(Collectors.toList());

        // 4️⃣ Top 5 products by revenue
        System.out.println("Top 5 Products by Revenue:");
        sortedProducts.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
