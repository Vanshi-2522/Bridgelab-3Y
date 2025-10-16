package handlingString;
import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase to simplify comparison
        String str = input.toLowerCase();

        int vowels = 0, consonants = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a letter
            if (Character.isLetter(ch)) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Output the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }
}
