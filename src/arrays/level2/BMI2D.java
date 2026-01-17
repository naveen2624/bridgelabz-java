package Arrays.Level2;

import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            personData[i][0] = sc.nextDouble(); // weight
            personData[i][1] = sc.nextDouble(); // height

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                i--;
                continue;
            }

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++)
            System.out.println(personData[i][1] + " " +
                    personData[i][0] + " " +
                    personData[i][2] + " " +
                    status[i]);

        sc.close();
    }
}
