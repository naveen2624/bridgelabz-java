package Arrays;

import java.util.Scanner;

/*
 * Program Name : VotingCheck
 * Description  : This program reads the ages of 10 students and
 *                checks whether each student is eligible to vote
 *                based on age criteria.
 * Rules:
 *   - Age < 0      → Invalid age
 *   - Age ≥ 18     → Eligible to vote
 *   - Age < 18     → Not eligible to vote
 * Author       : Naveen
 */

public class VotingCheck {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        /*
         * Read ages of students from the user
         */
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        /*
         * Check voting eligibility for each student
         */
        for (int age : ages) {

            // Validate age input
            if (age < 0) {
                System.out.println("Invalid age");
            }

            // Check if student is eligible to vote
            else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote");
            }

            // Student is not eligible to vote
            else {
                System.out.println("The student with the age " + age + " cannot vote");
            }
        }

        // Close the Scanner resource
        sc.close();
    }
}
