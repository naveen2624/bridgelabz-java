package strings.level3;

import java.util.Scanner;

public class BMICalculatorTeam {

    static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = hw[i][0];
            double heightM = hw[i][1] / 100;
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(hw[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (String[] row : data) {
            for (String val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble(); // weight
            hw[i][1] = sc.nextDouble(); // height
        }

        display(calculateBMI(hw));
    }
}
