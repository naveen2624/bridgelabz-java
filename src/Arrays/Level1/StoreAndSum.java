package Arrays;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            if (input <= 0 || index == 10)
                break;

            numbers[index++] = input;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println(numbers[i]);
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}
