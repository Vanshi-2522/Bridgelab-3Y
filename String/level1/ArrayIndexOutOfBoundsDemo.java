
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method that generates ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Accessing invalid index
        System.out.println("Name at index " + index + " : " + names[index]);
    }

    // Method that handles ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + " : " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException! Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define array of names
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Take index input
        System.out.print("Enter an index to access (0 - " + (names.length - 1) + "): ");
        int index = sc.nextInt();

        // Call method that generates exception
        System.out.println("\nCalling generateException():");
        try {
            generateException(names, index); // will throw exception if index invalid
        } catch (Exception e) {
            System.out.println("Program crashed with exception: " + e);
        }

        // Call method that handles exception
        System.out.println("\nCalling handleException():");
        handleException(names, index);
    }
}
