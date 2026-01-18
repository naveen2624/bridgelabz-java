package EncapsulationInterface;

import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    // Concrete method
    public void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Base Price : " + price);
    }

    // Encapsulation: getters & setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Electronics class
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return price * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return price * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

// Groceries class
class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}

// Main class
public class ECommercePlatform {

    // Polymorphic method
    public static void printFinalPrice(List<Product> products) {
        for (Product p : products) {

            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.price + tax - discount;

            p.displayProduct();
            System.out.println("Discount   : " + discount);
            System.out.println("Tax        : " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics(1, "Laptop", 60000));
        productList.add(new Clothing(2, "T-Shirt", 1000));
        productList.add(new Groceries(3, "Rice Bag", 1200));

        // Polymorphism in action
        printFinalPrice(productList);
    }
}
