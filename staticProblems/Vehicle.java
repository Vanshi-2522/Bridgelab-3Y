package staticProblems;

public class Vehicle {

    // Static variable - common registration fee for all vehicles
    private static double registrationFee = 500.0; // default fee

    // Final variable - unique registration number
    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize instance variables
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to $" + registrationFee);
        } else {
            System.out.println("Invalid registration fee.");
        }
    }

    // Display vehicle details only if the object is an instance of Vehicle
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid object - Not a Vehicle instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("KA01AB1234", "Alice Johnson", "Car");
        Vehicle v2 = new Vehicle("MH12CD5678", "Bob Smith", "Motorcycle");

        // Display initial details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(750.0);

        // Display updated details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
