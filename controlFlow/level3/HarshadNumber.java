

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        // Calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // Check divisibility
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}

