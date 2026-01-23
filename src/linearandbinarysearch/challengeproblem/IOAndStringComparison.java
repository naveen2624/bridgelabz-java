package linearandbinarysearch.challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOAndStringComparison {

    // ---------- StringBuilder vs StringBuffer ----------
    static void compareStringBuilderAndBuffer() {

        int iterations = 1_000_000;

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();

        // StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbf.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("=== String Concatenation Comparison ===");
        System.out.println("StringBuilder Time (ms): " +
                (endBuilder - startBuilder) / 1_000_000);
        System.out.println("StringBuffer Time  (ms): " +
                (endBuffer - startBuffer) / 1_000_000);
        System.out.println();
    }

    // ---------- FileReader ----------
    static void readUsingFileReader(String filePath) {

        long start = System.nanoTime();
        long wordCount = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.isBlank()) {
                    wordCount += words.length;
                }
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        long end = System.nanoTime();

        System.out.println("=== FileReader Result ===");
        System.out.println("Word Count: " + wordCount);
        System.out.println("Time Taken (ms): " + (end - start) / 1_000_000);
        System.out.println();
    }

    // ---------- InputStreamReader ----------
    static void readUsingInputStreamReader(String filePath) {

        long start = System.nanoTime();
        long wordCount = 0;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr =
                    new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.isBlank()) {
                    wordCount += words.length;
                }
            }

            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        long end = System.nanoTime();

        System.out.println("=== InputStreamReader Result ===");
        System.out.println("Word Count: " + wordCount);
        System.out.println("Time Taken (ms): " + (end - start) / 1_000_000);
        System.out.println();
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        String largeFilePath = "largefile.txt"; // ~100MB file

        compareStringBuilderAndBuffer();
        readUsingFileReader(largeFilePath);
        readUsingInputStreamReader(largeFilePath);
    }
}
