import java.util.*;
public class cal{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("sum:"+sum+" sub:"+sub+" mul:"+mul+" div:"+div);
    }
}