import java.util.Scanner;
public class SimpleInterestCalculater {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate  = sc.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is: " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        sc.close();
    }
}
