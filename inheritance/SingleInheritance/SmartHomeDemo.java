package inheritance.SingleInheritance;
// SmartHomeDemo.java

class Device {
    String deviceId;
    String status; // e.g., "ON", "OFF"

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("THERMO_001", "ON", 22.5);
        thermostat.displayStatus();
    }
}

