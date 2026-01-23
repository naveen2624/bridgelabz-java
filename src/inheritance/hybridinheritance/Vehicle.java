package inheritance.hybridinheritance;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class PetrolVehicle extends Vehicle implements Refuelable {
    @Override
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Charging battery");
    }
}
