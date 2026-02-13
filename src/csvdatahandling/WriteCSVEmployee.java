package csvdatahandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVEmployee {

    public static void main(String[] args) {

        String filePath = "src\\csvdatahandling\\csvfiles\\employee.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Write header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // Write employee records
            bw.write("106,Arun,Engineering,75000");
            bw.newLine();

            bw.write("102,Priya,HR,60000");
            bw.newLine();

            bw.write("103,Ravi,Finance,80000");
            bw.newLine();

            bw.write("104,Meena,Marketing,65000");
            bw.newLine();

            bw.write("105,Karan,Engineering,90000");
            bw.newLine();

            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
