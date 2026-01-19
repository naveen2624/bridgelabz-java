package constructorsinstancevariableaccessmodifiers.constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Default constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Hatchback";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRental() {
        System.out.println(customerName + " | " + carModel +
                " | Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Naveen", "SUV", 4);

        r1.displayRental();
        r2.displayRental();
    }
}
