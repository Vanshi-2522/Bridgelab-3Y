package inheritance.AssistedProblems;
// VehicleDemo.java

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("---------------------------");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    double loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("---------------------------");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    boolean hasCarrier;

    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15.5);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

        // Polymorphism in action
        Vehicle[] vehicles = { car, truck, motorcycle };

        for (Vehicle v : vehicles) {
            v.displayInfo();  // Dynamic method call
        }
    }
}

