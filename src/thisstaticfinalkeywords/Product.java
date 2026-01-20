package thisstaticfinalkeywords;

class Product {

    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void processProduct(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Discount: " + discount + "%");
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product.updateDiscount(15);
        p1.processProduct(p1);
    }
}
