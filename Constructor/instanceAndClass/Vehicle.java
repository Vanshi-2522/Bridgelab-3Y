package Constructor.instanceAndClass;

// Vehicle class
public class Vehicle {
    // Instance variables (unique for each vehicle)
    private String ownerName;
    private String vehicleType;

    // Class variable (shared for all vehicles)
    private static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method → display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("-----------------------------");
    }

    // Class method → update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("✅ Registration fee updated to ₹" + newFee);
    }
}

// Test class
class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");

        System.out.println("🚗 Initial Vehicle Details:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(7000.0);

        System.out.println("🚗 Vehicle Details After Fee Update:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
