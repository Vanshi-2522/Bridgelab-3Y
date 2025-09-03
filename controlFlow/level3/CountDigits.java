
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to count digits: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number);  // handle negative numbers

        if (temp == 0) {
            count = 1; // zero has 1 digit
        } else {
            while (temp != 0) {
                temp = temp / 10;  // remove last digit
                count++;
            }
        }

        System.out.println("Number of digits in " + number + " is " + count);
        sc.close();
    }
}

