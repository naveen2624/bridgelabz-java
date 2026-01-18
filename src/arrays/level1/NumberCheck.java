package Arrays;

import java.util.Scanner;

/*
 * Program Name : NumberCheck
 * Description  : This program reads 5 numbers into an array and
 *                checks whether each number is Positive, Negative,
 *                or Zero. If the number is positive, it also checks
 *                whether it is Even or Odd. Finally, it compares
 *                the first and last elements of the array.
 * Author       : Naveen
 */

public class NumberCheck {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Array to store 5 integers
        int[] numbers = new int[5];

        /*
         * Read 5 numbers from the user
         * and store them in the array
         */
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        /*
         * Check each number:
         * - Positive / Negative / Zero
         * - Even or Odd (only if positive)
         */
        for (int num : numbers) {

            // Check if the number is positive
            if (num > 0) {
                System.out.print(num + " is Positive and ");

                // Ternary operator to check Even or Odd
                System.out.println(num % 2 == 0 ? "Even" : "Odd");
            }

            // Check if the number is negative
            else if (num < 0) {
                System.out.println(num + " is Negative");
            }

            // If the number is zero
            else {
                System.out.println(num + " is Zero");
            }
        }

        /*
         * Compare the first and last elements
         * of the array
         */
        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are Equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is Greater than last");
        else
            System.out.println("First element is Less than last");

        // Close the Scanner resource
        sc.close();
    }
}
