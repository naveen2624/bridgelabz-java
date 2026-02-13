package csvdatahandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {

    public static void main(String[] args) throws IOException {

        String filePath = "src\\csvdatahandling\\csvfiles\\users.csv";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^\\d{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine(); // skip header

        String line;
        int rowNumber = 1;

        while ((line = br.readLine()) != null) {
            rowNumber++;
            String[] data = line.split(",");

            boolean validEmail = emailPattern.matcher(data[2]).matches();
            boolean validPhone = phonePattern.matcher(data[3]).matches();

            if (!validEmail || !validPhone) {
                System.out.println("Invalid Row at line " + rowNumber + ": " + line);
            }
        }

        br.close();
    }
}
