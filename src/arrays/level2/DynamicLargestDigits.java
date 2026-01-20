package arrays.level2;

import java.util.Scanner;

/*
 * Program Name : DynamicLargestDigits
 * Description  : This program extracts all digits from a given number,
 *                stores them dynamically in an array, and finds the
 *                largest and second largest digits.
 * Author       : Naveen
 */

public class DynamicLargestDigits {
    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        int number = sc.nextInt();

        // Initial size of the digits array
        int maxDigit = 10;

        // Array to store digits dynamically
        int[] digits = new int[maxDigit];

        // Index to track number of digits stored
        int index = 0;

        /*
         * Extract digits from the number
         * and store them in the array
         */
        while (number != 0) {

            // Resize the array if it becomes full
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }

            // Store the last digit
            digits[index++] = number % 10;

            // Remove the last digit from the number
            number /= 10;
        }

        // Variables to store largest and second largest digits
        int largest = 0, secondLargest = 0;

        /*
         * Find the largest and second largest digits
         */
        for (int i = 0; i < index; i++) {

            // Update largest and second largest values
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        // Close the Scanner resource
        sc.close();
    }
}
