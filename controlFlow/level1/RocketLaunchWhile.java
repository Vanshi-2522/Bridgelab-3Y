

import java.util.Scanner;

public class RocketLaunchWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter countdown start number: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Final message
        System.out.println("Lift off!");

        scanner.close();
    }
}
