package Arrays.Level2;

import java.util.Scanner;

/*
 * Program Name : BMIProgram
 * Description  : This program calculates the BMI (Body Mass Index)
 *                for multiple persons using separate 1D arrays
 *                for weight, height, BMI value, and health status.
 * Formula      : BMI = weight / (height * height)
 * Author       : Naveen
 */

public class BMIProgram {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read number of persons
        int n = sc.nextInt();

        // Arrays to store weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        /*
         * Read weight and height for each person
         * Calculate BMI and determine health status
         */
        for (int i = 0; i < n; i++) {

            // Read weight and height
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine BMI category
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
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
                    height[i] + " " +
                            weight[i] + " " +
                            bmi[i] + " " +
                            status[i]
            );

        // Close the Scanner resource
        sc.close();
    }
}
