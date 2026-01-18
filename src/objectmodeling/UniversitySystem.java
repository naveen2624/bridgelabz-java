package ObjectModeling;

import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class UniDepartment {
    String name;

    UniDepartment(String name) {
        this.name = name;
    }
}

class University {
    List<UniDepartment> unidepartments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    void addDepartment(UniDepartment d) {
        unidepartments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University u = new University();
        u.addDepartment(new UniDepartment("CSE"));
        u.addFaculty(new Faculty("Dr. Kumar"));
    }
}
