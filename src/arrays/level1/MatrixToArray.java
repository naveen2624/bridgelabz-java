package Arrays;

import java.util.Scanner;

/*
 * Program Name : MatrixToArray
 * Description  : This program reads a 2D matrix from the user
 *                and converts it into a 1D array by storing
 *                all elements in row-wise order.
 * Author       : Naveen
 */

public class MatrixToArray {
    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read number of rows and columns of the matrix
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Declare a 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        // Declare a 1D array to store matrix elements
        int[] array = new int[rows * cols];

        // Index to track position in the 1D array
        int index = 0;

        /*
         * Read elements of the matrix
         * Row-wise input
         */
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        /*
         * Convert the 2D matrix into a 1D array
         * by copying elements row by row
         */
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[index++] = matrix[i][j];

        // Print the elements of the 1D array
        for (int val : array)
            System.out.print(val + " ");

        // Close the Scanner resource
        sc.close();
    }
}
