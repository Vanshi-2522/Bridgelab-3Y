
import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n >= 1) {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using while loop
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            // Compare and print results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);

            if (formulaSum == sum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        scanner.close();
    }
}

