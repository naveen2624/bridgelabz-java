package constructorsinstancevariableaccessmodifiers.instanceclassvariablesandmethods;

public class Product {


    // Instance variable to store product name
    String productName;

    // Instance variable to store product price
    double price;

    // Static variable to keep track of total products created
    static int totalProducts;

    // Parameterized constructor to initialize product details
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment count when a product object is created
    }

    // Instance method to display individual product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Static method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating Product objects
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("HeadPhones", 1500);

        // Displaying product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Displaying total number of products created
        Product.displayTotalProducts();
    }

}
