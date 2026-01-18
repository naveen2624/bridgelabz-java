package methods.level1;

import java.util.Scanner;

public class QuotientRemainder {

    /*
     * This method finds quotient and remainder
     */
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Method call
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }
}
