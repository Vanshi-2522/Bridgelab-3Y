package Constructor.instanceAndClass;

// Product class
public class Product {
    // Instance variables (unique to each object)
    private String productName;
    private double price;

    // Class variable (shared among all objects)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment when a new product is created
    }

    // Instance method → works on object data
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method → works on class variable
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Test class
class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 30000.0);
        Product p3 = new Product("Tablet", 20000.0);

        System.out.println("📦 Individual Product Details:");
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        p3.displayProductDetails();

        System.out.println("\n📊 Inventory Summary:");
        Product.displayTotalProducts(); // call static method
    }
}

