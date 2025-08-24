import java.util.*;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int number3 = s.nextInt();
        boolean isSmallest = (number1 <= number2 && number1 <= number3);
        System.out.println("Is the first number the smallest? " + isSmallest);
        s.close();
    }
}
