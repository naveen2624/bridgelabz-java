package EncapsulationInterface;

import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity - applyDiscount();
    }

    public double applyDiscount() {
        return price * quantity * 0.10;
    }

    public String getDiscountDetails() {
        return "Veg Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity + 50 - applyDiscount();
    }

    public double applyDiscount() {
        return price * quantity * 0.05;
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: 5%, Extra Charge: 50";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Rice", 120, 2));
        order.add(new NonVegItem("Chicken Biryani", 200, 1));

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("----------------------");
        }
    }
}
