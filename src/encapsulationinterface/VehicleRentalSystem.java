package EncapsulationInterface;

import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Type           : " + type);
        System.out.println("Rental Rate    : " + rentalRate + " per day");
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    protected String maskedPolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.10; // 10% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (10%), Policy: " + maskedPolicyNumber();
    }
}

class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05; // 5% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (5%), Policy: " + maskedPolicyNumber();
    }
}

class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 2000; // extra heavy vehicle charge
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15; // 15% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (15%), Policy: " + maskedPolicyNumber();
    }
}


public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("TN10AB1234", 2000, "CAR987654"));
        vehicles.add(new Bike("TN22XY5678", 800, "BIKE456789"));
        vehicles.add(new Truck("TN09TR9999", 5000, "TRUCK123456"));

        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();

            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost (" + days + " days): " + rentalCost);

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance Cost : " + i.calculateInsurance());
                System.out.println(i.getInsuranceDetails());
            }

            System.out.println("----------------------------------");
        }
    }
}
