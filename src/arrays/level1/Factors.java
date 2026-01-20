package arrays.level1;

import java.util.Scanner;

/*
 * Program Name : Factors
 * Description  : This program finds and prints all the factors
 *                of a given number entered by the user.
 * Author       : Naveen
 */

public class Factors {
    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number for which factors are to be found
        int number = sc.nextInt();

        // Initial size of the array to store factors
        int maxSize = 10;

        // Array to store factors dynamically
        int[] factors = new int[maxSize];

        // Index to track number of factors stored
        int index = 0;

        /*
         * Loop from 1 to the given number
         * If i divides the number completely,
         * then i is a factor
         */
        for (int i = 1; i <= number; i++) {

            // Check if i is a factor of the number
            if (number % i == 0) {

                /*
                 * If the array is full,
                 * double its size and copy old values
                 * to the new array
                 */
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }

                // Store the factor in the array
                factors[index++] = i;
            }
        }

        // Print all the stored factors
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        // Close the Scanner resource
        sc.close();
    }
}
