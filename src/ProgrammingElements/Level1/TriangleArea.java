package ProgrammingElements.Level1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;

        System.out.println(
                "The area of triangle is " + areaInches +
                        " square inches and " + areaCm + " square centimeters"
        );
    }
}
