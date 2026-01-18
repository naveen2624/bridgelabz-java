package methods.level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    /*
     * This method calculates sum of n natural numbers
     * using a loop
     */
    public static int calculateSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Method call
        int result = calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + result);

        sc.close();
    }
}
