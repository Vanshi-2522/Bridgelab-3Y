
import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Number must be positive and less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            int counter = 100;  // Start from 100 and go down

            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
        sc.close();
    }
}
