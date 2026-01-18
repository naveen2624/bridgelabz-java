package Arrays;

import java.util.Scanner;

/*
 * Program Name : OddEvenArray
 * Description  : This program takes a natural number as input and
 *                stores all odd numbers and even numbers separately
 *                into two different arrays, then displays them.
 * Author       : Naveen
 */

public class OddEvenArray {
    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the natural number limit
        int number = sc.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid Natural Number");
            return;
        }

        /*
         * Arrays to store even and odd numbers
         * Size is calculated based on the given number
         */
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        // Index counters for even and odd arrays
        int e = 0, o = 0;

        /*
         * Loop from 1 to the given number
         * Separate odd and even numbers
         */
        for (int i = 1; i <= number; i++) {

            // Check if the number is even
            if (i % 2 == 0)
                even[e++] = i;

                // Otherwise, the number is odd
            else
                odd[o++] = i;
        }

        // Display all odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");

        // Display all even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");

        // Close the Scanner resource
        sc.close();
    }
}
