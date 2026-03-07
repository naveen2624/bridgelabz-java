package jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Student {
    public String name;
    public int age;
    public List<String> subjects;
}

public class StudentJsonExample {

    public static void main(String[] args) throws Exception {

        Student student = new Student();
        student.name = "Naveen";
        student.age = 22;
        student.subjects = Arrays.asList("Math", "AI", "Data Science");

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(student);

        System.out.println(json);
    }
}