package classandobject.level2;

public class CartItem {

    // Cart item attributes
    String itemName;
    double price;
    int quantity;

    /*
     * Method to add item to cart
     */
    public void addItem(String name, double itemPrice, int qty) {

        itemName = name;
        price = itemPrice;
        quantity = qty;

        System.out.println("Item Added to Cart");
    }

    /*
     * Method to remove item from cart
     */
    public void removeItem() {

        itemName = null;
        price = 0;
        quantity = 0;

        System.out.println("Item Removed from Cart");
    }

    /*
     * Method to display total cost
     */
    public void displayTotalCost() {

        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {

        CartItem cart = new CartItem();

        cart.addItem("Laptop", 55000, 1);
        cart.displayTotalCost();

        cart.removeItem();
        cart.displayTotalCost();
    }
}
