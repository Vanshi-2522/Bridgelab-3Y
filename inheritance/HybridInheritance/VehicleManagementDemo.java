package inheritance.HybridInheritance;
// VehicleManagementDemo.java

interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric Vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling petrol.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle");
    }
}

public class VehicleManagementDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 240);

        Vehicle[] vehicles = { ev, pv };

        for (Vehicle v : vehicles) {
            v.displayInfo();

            if (v instanceof ElectricVehicle ev1) {
                ev1.charge();
            }
            if (v instanceof Refuelable refuelable) {
                refuelable.refuel();
            }

            System.out.println("-------------------------");
        }
    }
}
