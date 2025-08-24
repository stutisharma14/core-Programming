import java.util.*;
public class miles {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
         double distanceInFeet = s.nextDouble();
        double distanceInYards = distanceInFeet / 3;        
        double distanceInMiles = distanceInYards / 1760; 
        System.out.println("distanceinYard:"+distanceInYards+" distanceinmiles:"+distanceInMiles);
    }
}
