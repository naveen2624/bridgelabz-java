package constructorsinstancevariableaccessmodifiers.accessmodifiers;

class Student {

    // Public variable - accessible everywhere
    public int rollNumber;

    // Protected variable - accessible in subclass
    protected String name;

    // Private variable - accessible only within this class
    private double cgpa;

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter method to access CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public setter method to modify CGPA
    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    // Method to display student details
    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + cgpa);
    }
}
class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method demonstrating access to protected member
    void displayPGStudent() {
        System.out.println("Roll Number     : " + rollNumber); // public
        System.out.println("Name            : " + name);       // protected
        System.out.println("Specialization  : " + specialization);
        System.out.println("CGPA            : " + getCGPA());  // private via public method
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {

        PostgraduateStudent pg =
                new PostgraduateStudent(101, "Naveen", 8.6, "Data Science");

        // Display details
        pg.displayPGStudent();

        // Modifying CGPA using setter
        pg.setCGPA(9.1);

        System.out.println("\nAfter CGPA Update:");
        pg.displayPGStudent();
    }
}
