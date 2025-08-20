import java.util.*;
public class simpleintrest {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        s.close();
        int si=(p*r*t)/100;
        System.out.println(si);
    }
}
