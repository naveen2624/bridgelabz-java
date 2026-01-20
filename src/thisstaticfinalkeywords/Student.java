package thisstaticfinalkeywords;

class Student {

    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Student) {
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(10, "Arjun", 'A');
        s1.displayDetails(s1);
        Student.displayTotalStudents();
    }
}

