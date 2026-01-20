package arrays.level1;

import java.util.Scanner;

/*
 * Program Name : MultiplicationTable
 * Description  : This program generates and displays the
 *                multiplication table of a given number
 *                using an array.
 * Author       : Naveen
 */

public class MultiplicationTable {
    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number for which multiplication table is needed
        int number = sc.nextInt();

        // Array to store multiplication table values
        int[] table = new int[10];

        /*
         * Calculate multiplication table
         * and store values in the array
         */
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        /*
         * Print the multiplication table
         * using values stored in the array
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // Close the Scanner resource
        sc.close();
    }
}
