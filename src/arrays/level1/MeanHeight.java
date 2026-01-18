package Arrays;

import java.util.Scanner;

/*
 * Program Name : MeanHeight
 * Description  : This program reads the heights of 11 players
 *                and calculates their mean (average) height.
 * Formula      : Mean = Total Height / Number of Players
 * Author       : Naveen
 */

public class MeanHeight {
    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];

        // Variable to store sum of heights
        double sum = 0;

        /*
         * Read heights of all players
         * and calculate the total sum
         */
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate and display the mean height
        System.out.println("Mean Height = " + (sum / 11));

        // Close the Scanner resource
        sc.close();
    }
}
