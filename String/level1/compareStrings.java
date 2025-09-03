
import java.util.Scanner;

public class compareStrings {
    
    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;  // lengths differ → not equal
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;  // mismatch found
            }
        }
        return true; // all characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean manualCompare = compareStringsCharAt(str1, str2);

        // Compare using built-in equals()
        boolean builtinCompare = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + manualCompare);
        System.out.println("Comparison using equals(): " + builtinCompare);
        System.out.println("Are both results same? " + (manualCompare == builtinCompare));
    }
}


