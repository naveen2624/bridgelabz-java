package linearandbinarysearch.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleInputToFile {

    public static void main(String[] args) {

        String filePath = "output.txt";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true); // append mode

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(input + System.lineSeparator());
            }

            fw.close();
            br.close();
            isr.close();

            System.out.println("Input saved to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
