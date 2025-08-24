import java.util.*;
public class areaoftri {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double h=s.nextInt();
        double b=s.nextInt();
        double area=0.5 *b*h;
        double areain=area/6.4516;
        System.out.println("area in cm:"+area+" areain "+areain);
    }
}
