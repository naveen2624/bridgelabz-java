package ObjectModeling;

import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();
}

class EcomCustomer {
    String name;

    EcomCustomer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order");
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        EcomCustomer c = new EcomCustomer("Naveen");
        Order o = new Order();
        o.products.add(new Product("Laptop"));

        c.placeOrder(o);
    }
}
