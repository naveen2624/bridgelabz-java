package ObjectModeling;

import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.students.add(this);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Naveen");
        Course c1 = new Course("Java");

        s1.enroll(c1);
    }
}
