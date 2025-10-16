package handlingString;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Reverse the characters manually
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}

