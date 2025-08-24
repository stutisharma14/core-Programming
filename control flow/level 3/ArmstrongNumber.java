import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int originalNumber = number;
        int sum = 0;

        // Step 3: Loop to extract digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;   // get last digit
            sum += digit * digit * digit;      // add cube of digit
            originalNumber /= 10;              // remove last digit
        }

        // Step 4: Compare sum with original number
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
