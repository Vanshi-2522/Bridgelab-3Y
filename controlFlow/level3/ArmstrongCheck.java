

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to check if Armstrong number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;               // get last digit
            sum += digit * digit * digit;                   // cube it and add to sum
            originalNumber = originalNumber / 10;           // remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
