package classandobject.level1;

public class Item {

    // Item attributes
    int itemCode;
    String itemName;
    double price;

    /*
     * Method to display item details
     */
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    /*
     * Method to calculate total cost
     */
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        // Create Item object
        Item item = new Item();

        // Assign values
        item.itemCode = 201;
        item.itemName = "Pen";
        item.price = 10.5;

        // Display item details
        item.displayItemDetails();

        // Calculate total cost
        int quantity = 5;
        System.out.println("Total Cost for " + quantity + " items: " +
                item.calculateTotalCost(quantity));
    }
}
