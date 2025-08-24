import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A+  | Remarks: Excellent");
        } else if (average >= 80) {
            System.out.println("Grade: A   | Remarks: Very Good");
        } else if (average >= 70) {
            System.out.println("Grade: B   | Remarks: Good");
        } else if (average >= 60) {
            System.out.println("Grade: C   | Remarks: Satisfactory");
        } else if (average >= 50) {
            System.out.println("Grade: D   | Remarks: Pass");
        } else {
            System.out.println("Grade: F   | Remarks: Fail");
        }

        sc.close();
    }
}
