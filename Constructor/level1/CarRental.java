package Constructor.level1;

// CarRental class
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 1000.0; // fixed rate for simplicity

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Car";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("-----------------------------");
    }
}

// Test
class CarRentalTest {
    public static void main(String[] args) {
        CarRental r1 = new CarRental(); // default
        CarRental r2 = new CarRental("Bob", "Honda City", 5); // parameterized

        r1.displayRental();
        r2.displayRental();
    }
}
