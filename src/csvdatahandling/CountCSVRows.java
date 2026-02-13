package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        String filePath = "src\\csvdatahandling\\csvfiles\\employee.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total Records: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
