package csvdatahandling;
import java.io.*;
import java.util.*;

class Student {
    String id, name;
    int age, marks;

    Student(String id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return id + " | " + name + " | " + age + " | " + marks;
    }
}


public class CSVToObject {

    public static void main(String[] args) throws IOException {

        String filePath = "src\\csvdatahandling\\csvfiles\\student.csv";

        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine(); // skip header

        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            students.add(new Student(
                    data[0],
                    data[1],
                    Integer.parseInt(data[2]),
                    Integer.parseInt(data[3])
            ));
        }

        br.close();

        students.forEach(System.out::println);
    }
}
