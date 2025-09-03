

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double number;

        // Input and summing loop
        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextDouble();

        while (number != 0) {
            total += number;

            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }

        // Output the total
        System.out.println("Total sum: " + total);

        scanner.close();
    }
}
