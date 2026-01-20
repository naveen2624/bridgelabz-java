package arrays.level1;

import java.util.Scanner;

/*
 * Program Name : FizzBuzz
 * Description  : This program prints Fizz, Buzz, or FizzBuzz
 *                based on the position number entered by the user.
 * Rules:
 *   - Multiple of 3  → "Fizz"
 *   - Multiple of 5  → "Buzz"
 *   - Multiple of 3 and 5 → "FizzBuzz"
 *   - Otherwise → the number itself
 * Author       : Naveen
 */

public class FizzBuzz {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int number = sc.nextInt();

        // Validate input (must be greater than 0)
        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        // Array to store the FizzBuzz results
        String[] result = new String[number + 1];

        /*
         * Loop from 1 to the given number
         * Apply FizzBuzz rules and store results
         */
        for (int i = 1; i <= number; i++) {

            // Check if divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0)
                result[i] = "FizzBuzz";

                // Check if divisible by 3
            else if (i % 3 == 0)
                result[i] = "Fizz";

                // Check if divisible by 5
            else if (i % 5 == 0)
                result[i] = "Buzz";

                // Otherwise, store the number itself
            else
                result[i] = String.valueOf(i);
        }

        // Print the result with position information
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        // Close the Scanner resource
        sc.close();
    }
}
