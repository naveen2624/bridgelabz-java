package classandobject.level2;

public class Student {
    String name;
    int rollNumber;
    double marks;

    public char gradeCalculator(){
        if (marks >= 80)
            return 'A';
        else if (marks >= 60)
            return 'B';
        else if (marks >= 40)
            return 'C';
        else
            return 'F';
    }
    public void displayStudentGrade(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + gradeCalculator());
    }
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Ramesh";
        s.rollNumber=23;
        s.marks=82;
        s.displayStudentGrade();
    }
}
