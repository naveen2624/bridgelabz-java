package methods.level1;

import java.util.Scanner;

public class TriangularPark {

    /*
     * This method calculates number of rounds
     * required to complete a 5 km run
     */
    public static double calculateRounds(double side1, double side2, double side3) {

        // Perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance = 5000 meters
        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking triangle sides as input
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        // Method call
        double rounds = calculateRounds(a, b, c);

        // Output
        System.out.println("Number of rounds needed: " + rounds);

        sc.close();
    }
}
