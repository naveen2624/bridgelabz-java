package constructorsinstancevariableaccessmodifiers.instanceclassvariablesandmethods;

public class Course {

    // Instance variable to store course name
    String courseName = "English";

    // Instance variable to store course fees
    double fees = 50000;

    // Instance variable to store course duration (in months/years as per requirement)
    double duration = 4;

    // Static variable shared by all Course objects
    static String instituteName = "SRMIST";

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Institute: " + instituteName);
    }

    // Static method to update institute name for all courses
    static void updateInstituteName() {
        instituteName = "Bridgelabz";
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Creating Course object
        Course c = new Course();

        // Displaying course details before update
        c.displayCourseDetails();

        // Updating institute name using static method
        Course.updateInstituteName();

        // Displaying course details after update
        c.displayCourseDetails();
    }
}
