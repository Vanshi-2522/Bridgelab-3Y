package Constructor.level1;

// Circle class
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0);  // calls parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayCircle() {
        System.out.println("Circle radius: " + radius);
    }
}

// Test class
class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();       // uses default
        Circle c2 = new Circle(5.5);    // uses parameterized

        c1.displayCircle();
        c2.displayCircle();
    }
}
