package Arrays.Level2;

import java.util.Scanner;

/*
 * Program Name : BMI2D
 * Description  : This program calculates the BMI (Body Mass Index)
 *                for multiple persons using a 2D array.
 *                It stores weight, height, BMI value, and determines
 *                the health status for each person.
 * Formula      : BMI = weight / (height * height)
 * Author       : Naveen
 */

public class BMI2D {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read number of persons
        int n = sc.nextInt();

        /*
         * 2D array to store:
         * index 0 → weight
         * index 1 → height
         * index 2 → BMI value
         */
        double[][] personData = new double[n][3];

        // Array to store BMI status for each person
        String[] status = new String[n];

        /*
         * Read weight and height for each person
         * Calculate BMI and determine health status
         */
        for (int i = 0; i < n; i++) {

            // Read weight and height
            personData[i][0] = sc.nextDouble(); // weight
            personData[i][1] = sc.nextDouble(); // height

            /*
             * Validate input:
             * If weight or height is invalid,
             * repeat input for the same person
             */
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                i--;
                continue;
            }

            // Calculate BMI
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            // Store BMI value temporarily
            double bmi = personData[i][2];

            // Determine BMI category
            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        /*
         * Display height, weight, BMI, and status
         * for each person
         */
        for (int i = 0; i < n; i++)
            System.out.println(
                    personData[i][1] + " " +
                            personData[i][0] + " " +
                            personData[i][2] + " " +
                            status[i]
            );

        // Close the Scanner resource
        sc.close();
    }
}
