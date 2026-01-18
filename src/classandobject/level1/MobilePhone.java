package classandobject.level1;

public class MobilePhone {

    // Mobile phone attributes
    String brand;
    String model;
    double price;

    /*
     * Method to display mobile phone details
     */
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone();

        // Assign values
        phone.brand = "Samsung";
        phone.model = "Galaxy S21";
        phone.price = 55000;

        // Display phone details
        phone.displayDetails();
    }
}
