package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public static class LargeCSVReader {

        public static void main(String[] args) throws IOException {

            String filePath = "src\\csvdatahandling\\csvfiles\\largefile.csv";

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine(); // skip header

            List<String> chunk = new ArrayList<>();
            String line;
            int totalProcessed = 0;

            while ((line = br.readLine()) != null) {

                chunk.add(line);

                if (chunk.size() == 100) {
                    processChunk(chunk);
                    totalProcessed += chunk.size();
                    chunk.clear();
                }
            }

            // Process remaining
            if (!chunk.isEmpty()) {
                processChunk(chunk);
                totalProcessed += chunk.size();
            }

            br.close();

            System.out.println("Total Records Processed: " + totalProcessed);
        }

        private static void processChunk(List<String> chunk) {
            // Simulate processing
            System.out.println("Processing batch of " + chunk.size());
        }
    }
}
