/* (2)
Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___
*/

public class AveragePercentMarkinPCM {
    public static void main(String[] args) {
        int math = 94;
        int physics = 95;
        int chemistry = 96;
        int totalMarks = math + physics + chemistry;
        double averageMarks = totalMarks / 3.0;
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }   
}
