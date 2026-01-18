import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : " + ratePerKm);
    }
}

class Car extends RideVehicle implements GPS {
    private String location = "Unknown";

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends RideVehicle implements GPS {
    private String location = "Unknown";

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends RideVehicle implements GPS {
    private String location = "Unknown";

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 1.1;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<RideVehicle> rides = new ArrayList<>();

        rides.add(new Car("C101", "Arjun", 15));
        rides.add(new Bike("B202", "Mani", 10));
        rides.add(new Auto("A303", "Suresh", 12));

        double distance = 8;

        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare: " + v.calculateFare(distance));
            System.out.println("----------------------");
        }
    }
}
