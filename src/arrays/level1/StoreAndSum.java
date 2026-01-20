package arrays.level1;

import java.util.Scanner;

/*
 * Program Name : StoreAndSum
 * Description  : This program stores up to 10 positive numbers
 *                entered by the user in an array. Input stops
 *                when a non-positive number is entered or when
 *                the array becomes full. Finally, it prints all
 *                stored numbers and their total sum.
 * Author       : Naveen
 */

public class StoreAndSum {
    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];

        // Variable to store the total sum
        double total = 0.0;

        // Index to track how many numbers are stored
        int index = 0;

        /*
         * Continuously read numbers from the user
         * Stop when:
         *  - A non-positive number is entered, or
         *  - The array size reaches 10
         */
        while (true) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            // Break the loop if input is invalid or array is full
            if (input <= 0 || index == 10)
                break;

            // Store valid input in the array
            numbers[index++] = input;
        }

        /*
         * Print all stored numbers
         * and calculate the total sum
         */
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println(numbers[i]);
        }

        // Display the total sum of entered numbers
        System.out.println("Total = " + total);

        // Close the Scanner resource
        sc.close();
    }
}
