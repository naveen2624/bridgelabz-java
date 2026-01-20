package constructorsinstancevariableaccessmodifiers.instanceclassvariablesandmethods;

public class Vehicle {

    // Instance variables (unique for each object)
    String vehicleName;
    String vehicleType;

    // Class variable (shared among all vehicles)
    static double registrationFee = 8000;

    // Parameterized constructor to initialize vehicle details
    Vehicle(String vehicleName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Static method to update registration fee for all vehicles
    static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Vehicle Registration Fee Updated");
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating Vehicle objects
        Vehicle v1 = new Vehicle("Slavia", "Sedan");
        Vehicle v2 = new Vehicle("I10", "Hatchback");

        // Displaying vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updating registration fee
        double newRegistrationFee = 9000;
        Vehicle.updateRegistrationFee(newRegistrationFee);

        // Displaying details after update
        v1.displayVehicleDetails();
    }
}
