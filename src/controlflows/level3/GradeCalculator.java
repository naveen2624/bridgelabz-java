package controlflows.level3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average: " + average);

        if (average >= 80)
            System.out.println("Grade A - Excellent");
        else if (average >= 70)
            System.out.println("Grade B - Very Good");
        else if (average >= 60)
            System.out.println("Grade C - Good");
        else if (average >= 50)
            System.out.println("Grade D - Average");
        else if (average >= 40)
            System.out.println("Grade E - Needs Improvement");
        else
            System.out.println("Grade R - Remedial");
    }
}
