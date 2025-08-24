import java.util.Scanner;

public class h{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Step 2: Find sum of digits
        while (number > 0) {
            int digit = number % 10;   // extract last digit
            sum += digit;              // add to sum
            number /= 10;              // remove last digit
        }

        // Step 3: Check divisibility
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
