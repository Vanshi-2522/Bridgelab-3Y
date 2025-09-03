

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        boolean isSpring = false;

        // Check if the date is in Spring Season
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) || 
            (month == 5 && day >= 1 && day <= 31) || 
            (month == 6 && day >= 1 && day <= 20)) {
            isSpring = true;
        }

        // Output
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        scanner.close();
    }
}
