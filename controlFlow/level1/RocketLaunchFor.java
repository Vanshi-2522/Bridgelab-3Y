

import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter countdown start number: ");
        int counter = scanner.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Final message
        System.out.println("Lift off!");

        scanner.close();
    }
}
