package methods.level2;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100;

            data[i][2] = weight / (heightMeters * heightMeters);
        }
    }

    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        for (int i = 0; i < 10; i++) {
            System.out.println("BMI: " + persons[i][2] +
                    " Status: " + getBMIStatus(persons[i][2]));
        }

        sc.close();
    }
}
