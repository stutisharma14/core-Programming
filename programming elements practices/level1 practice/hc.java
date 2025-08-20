import java.util.*;

public class hc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) Math.round(totalInches % 12);


        System.out.println(
                heightCm+feet+inches);

        sc.close();
    }
}
 
    

