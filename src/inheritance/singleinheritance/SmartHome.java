package inheritance.singleinheritance;
class Device {
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String id, boolean status, int temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Temp: " + temperatureSetting + "°C");
    }
}
