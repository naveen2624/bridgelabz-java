package arrays.level1;

import java.util.Scanner;

/*
 * Program Name : TableSixToNine
 * Description  : This program generates and displays the
 *                multiplication table of a given number
 *                from 6 to 9 using an array.
 * Author       : Naveen
 */

public class TableSixToNine {
    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number for which the table is to be generated
        int number = sc.nextInt();

        // Array to store multiplication results for 6 to 9
        int[] result = new int[4];

        /*
         * Calculate multiplication table values
         * from 6 to 9 and store them in the array
         */
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
        }

        /*
         * Display the multiplication table
         * from 6 to 9 using stored values
         */
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }

        // Close the Scanner resource
        sc.close();
    }
}
