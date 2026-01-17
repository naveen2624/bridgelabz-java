package Arrays;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        sc.close();
    }
}
