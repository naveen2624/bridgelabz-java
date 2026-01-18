package Arrays.Level2;

import java.util.Scanner;

/*
 * Program Name : DigitFrequency
 * Description  : This program reads an integer number and
 *                calculates the frequency of each digit (0–9)
 *                present in the number using an array.
 * Author       : Naveen
 */

public class DigitFrequency {
    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number whose digit frequency is to be calculated
        int number = sc.nextInt();

        // Array to store frequency of digits (0 to 9)
        int[] freq = new int[10];

        /*
         * Extract digits one by one and
         * increment their frequency count
         */
        while (number != 0) {

            // Get the last digit and increment its frequency
            freq[number % 10]++;

            // Remove the last digit
            number /= 10;
        }

        /*
         * Display digits that appear at least once
         */
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println("Digit " + i + ": " + freq[i]);

        // Close the Scanner resource
        sc.close();
    }
}
