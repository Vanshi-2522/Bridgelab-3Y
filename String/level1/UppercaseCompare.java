

import java.util.Scanner;

public class UppercaseCompare  {

    // Method to convert to uppercase manually using charAt()
    public static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32); // convert to uppercase
            } else {
                result += ch; // keep same if already uppercase or non-letter
            }
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Convert to uppercase manually
        String manualUpper = customToUpperCase(text);

        // Convert to uppercase using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean areEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase   : " + manualUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Are both equal?    : " + areEqual);
    }
}

