
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method that generates StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Access index beyond string length
        System.out.println("Character at index " + text.length() + " : " + text.charAt(text.length()));
    }

    // Method that handles StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Access index beyond string length
            System.out.println("Character at index " + text.length() + " : " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method that generates the exception
        System.out.println("\nCalling generateException():");
        try {
            generateException(text);  // will throw exception
        } catch (Exception e) {
            System.out.println("Program crashed with exception: " + e);
        }

        // Call method that handles the exception
        System.out.println("\nCalling handleException():");
        handleException(text);
    }
}

