package csvdatahandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVStudent {

    public static void main(String[] args) {

        String filePath = "src\\csvdatahandling\\csvfiles\\student.csv";  // Path to CSV file
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            br.readLine();

            System.out.println("Student Records:");
            System.out.println("----------------------------");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Age   : " + age);
                System.out.println("Marks : " + marks);
                System.out.println("----------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
