

import java.util.Scanner;

public class NumberFormat {
     // Method that generates NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method that handles NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method that generates exception
        System.out.println("\nCalling generateException():");
        try {
            generateException(text); // will throw NumberFormatException if not numeric
        } catch (Exception e) {
            System.out.println("Program crashed with exception: " + e);
        }

        // Call method that handles exception
        System.out.println("\nCalling handleException():");
        handleException(text);
    }
}
