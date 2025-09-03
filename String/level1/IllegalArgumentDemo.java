

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method that generates IllegalArgumentException
    public static void generateException(String text) {
        // start > end will throw IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method that handles IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            // start > end → exception
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException! Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method that generates the exception
        System.out.println("\nCalling generateException():");
        try {
            generateException(text); // will throw IllegalArgumentException
        } catch (Exception e) {
            System.out.println("Program crashed with exception: " + e);
        }

        // Call method that handles the exception
        System.out.println("\nCalling handleException():");
        handleException(text);
    }
}

