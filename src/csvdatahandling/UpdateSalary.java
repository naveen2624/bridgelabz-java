package csvdatahandling;

import java.io.*;
import java.util.*;

public class UpdateSalary {

    public static void main(String[] args) throws IOException {

        String inputFile = "src\\csvdatahandling\\csvfiles\\employee.csv";
        String outputFile = "src\\csvdatahandling\\csvfiles\\updated_employees.csv";

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        String header = br.readLine();
        bw.write(header);
        bw.newLine();

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (data[2].equalsIgnoreCase("IT")) {
                double salary = Double.parseDouble(data[3]);
                salary = salary * 1.10; // increase by 10%
                data[3] = String.valueOf((int) salary);
            }

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Updated file created successfully!");
    }
}
