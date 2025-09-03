

import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);  // appending characters
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using custom charAt() method
        String manualSub = createSubstring(text, start, end);

        // Substring using built-in substring()
        String builtInSub = text.substring(start, end);

        // Comparing both substrings
        boolean areEqual = compareStrings(manualSub, builtInSub);

        // Display results
        System.out.println("\nManual substring (charAt): " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
    }
}

