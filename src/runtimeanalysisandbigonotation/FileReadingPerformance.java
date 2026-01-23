package runtimeanalysisandbigonotation;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReadingPerformance {

    static void readUsingFileReader(String filePath) throws IOException {
        long start = System.nanoTime();
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        while (br.readLine() != null) {}

        br.close();
        fr.close();
        long end = System.nanoTime();

        System.out.println("FileReader Time (ms): " +
                (end - start) / 1_000_000);
    }

    static void readUsingInputStreamReader(String filePath) throws IOException {
        long start = System.nanoTime();
        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr =
                new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        while (br.readLine() != null) {}

        br.close();
        isr.close();
        fis.close();
        long end = System.nanoTime();

        System.out.println("InputStreamReader Time (ms): " +
                (end - start) / 1_000_000);
    }

    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt"; // up to 500MB

        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
}
