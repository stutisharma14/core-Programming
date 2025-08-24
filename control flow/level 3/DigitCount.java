import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int originalNumber = number;

        // Step 2: Handle 0 as a special case
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Loop to count digits
            while (number != 0) {
                number /= 10;   // remove last digit
                count++;        // increase digit count
            }
        }

        // Step 4: Display result
        System.out.println("Number of digits in " + originalNumber + " = " + count);

        sc.close();
    }
}
