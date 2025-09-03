

import java.util.Scanner;

public class CharArrayCompare {

    // Method to convert String to char array using charAt()
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i); // manually extract chars
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false; // lengths differ

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // mismatch found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get char arrays
        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();

        // Compare arrays
        boolean areEqual = compareCharArrays(customArr, builtInArr);

        // Display results
        System.out.println("\nCharacters using custom method:");
        for (char c : customArr) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters using toCharArray():");
        for (char c : builtInArr) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);
    }
}
