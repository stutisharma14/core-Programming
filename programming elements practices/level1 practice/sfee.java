import java.util.*;
public class sfee{
     public static void main(String args[]){
        Scanner s=new Scanner(System.in);
    int fee=s.nextInt();
    int disfee=(fee*10)/100;
    int payed=fee-disfee;
    System.out.println("the discounted fee is: "+disfee+" the payed fee is: "+payed);   } 
}