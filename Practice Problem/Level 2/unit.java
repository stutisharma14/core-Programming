
import java.util.*;

public class unit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double unitPrice = sc.nextDouble();

        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price  " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);
    }
}
