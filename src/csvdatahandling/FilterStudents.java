package csvdatahandling;
import java.io.*;

public class FilterStudents {

    public static void main(String[] args) throws IOException {

        String filePath = "src\\csvdatahandling\\csvfiles\\student.csv";

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        br.readLine(); // skip header

        String line;
        System.out.println("Students scoring more than 80:");

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            int marks = Integer.parseInt(data[3]);

            if (marks > 80) {
                System.out.println(line);
            }
        }

        br.close();
    }
}
