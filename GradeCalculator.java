import java.util.*;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of subjects:");
        int n = scan.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("enter marks for subjects " + i + ":");
            int marks = scan.nextInt();
            total += marks;

        }
        double average = total / n;
        String grade;
        if (average >= 90) {
            grade = "A";

        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total marks:" + total);
        System.out.println("average:" + average);
        System.out.println("grade :5" + grade);
    }
}






