package regexjunit.junit;

import java.io.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new IOException("File does not exist");
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();

        return content.toString();
    }
}


class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String testFile = "test.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit";

        processor.writeToFile(testFile, content);
        String result = processor.readFromFile(testFile);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(testFile, "Data");

        File file = new File(testFile);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistingFileThrowsException() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("invalid.txt");
        });
    }
}
