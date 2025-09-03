
import java.util.Scanner;

public class LowercaseCompare {

    // Method to convert to lowercase manually using charAt()
    public static String customToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); // convert to lowercase
            } else {
                result += ch; // keep unchanged if already lowercase or not a letter
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

        // Convert to lowercase manually
        String manualLower = customToLowerCase(text);

        // Convert to lowercase using built-in method
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean areEqual = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual Lowercase   : " + manualLower);
        System.out.println("Built-in Lowercase : " + builtInLower);
        System.out.println("Are both equal?    : " + areEqual);
    }
}
