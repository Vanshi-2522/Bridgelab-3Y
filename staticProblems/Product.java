package staticProblems;

public class Product {

    // Static variable shared by all products - discount percentage
    private static double discount = 10.0;  // default 10% discount

    // Final variable - unique product ID that cannot be changed
    private final int productID;

    private String productName;
    private double price;
    private int quantity;

    // Constructor uses 'this' to initialize instance variables
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        } else {
            System.out.println("Invalid discount value. Must be between 0 and 100.");
        }
    }

    // Calculate price after discount
    public double getPriceAfterDiscount() {
        return price * (1 - discount / 100);
    }

    // Display product details only if object is instance of Product
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Original Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price After Discount: $" + getPriceAfterDiscount());
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid object - Not a Product instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create product objects
        Product p1 = new Product(1001, "Laptop", 1200.0, 2);
        Product p2 = new Product(1002, "Smartphone", 800.0, 5);

        // Display initial product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Update discount
        Product.updateDiscount(15.0);

        // Display details after discount update
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}

