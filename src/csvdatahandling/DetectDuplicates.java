package csvdatahandling;

import java.io.*;
import java.util.*;

public class DetectDuplicates {

    public static void main(String[] args) throws IOException {

        String filePath = "src\\csvdatahandling\\csvfiles\\student.csv";

        Set<String> uniqueIds = new HashSet<>();
        Set<String> duplicateIds = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine();

        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String id = data[0];

            if (!uniqueIds.add(id)) {
                duplicateIds.add(id);
                System.out.println("Duplicate Record: " + line);
            }
        }

        br.close();

        if (duplicateIds.isEmpty()) {
            System.out.println("No duplicates found.");
        }
    }
}
