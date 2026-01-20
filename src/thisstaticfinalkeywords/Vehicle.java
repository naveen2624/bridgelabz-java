package thisstaticfinalkeywords;
class Vehicle {

    static double registrationFee = 5000;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayRegistration(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
        }
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car", "TN09AB1234");
        v1.displayRegistration(v1);
    }
}

