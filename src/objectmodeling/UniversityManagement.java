package ObjectModeling;

import java.util.*;

class UniCourse {
    String name;
    Professor professor;

    UniCourse(String name) {
        this.name = name;
    }
}

class UniStudent {
    String name;

    UniStudent(String name) {
        this.name = name;
    }

    void enrollCourse(UniCourse c) {
        System.out.println(name + " enrolled in " + c.name);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignProfessor(UniCourse c) {
        c.professor = this;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        UniCourse c = new UniCourse("Java");
        UniStudent s = new UniStudent("Naveen");
        Professor p = new Professor("Dr. Smith");

        p.assignProfessor(c);
        s.enrollCourse(c);
    }
}
