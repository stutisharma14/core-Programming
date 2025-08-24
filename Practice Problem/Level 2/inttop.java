import java.util.*;
public class inttop{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int result1 = a + b * c;     
        int result2 = a * b + c;     
        int result3 = c + a / b;     
        int result4 = a % b + c;     
        System.out.println("The results of Int Operations are: "
                           + result1 + ", "
                           + result2 + ", "
                           + result3 + ", "
                           + result4);
    }
}
