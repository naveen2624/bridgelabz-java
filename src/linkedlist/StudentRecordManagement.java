package linkedlist;
class StudentRecordManagement {

    // Node class
    static class Student {
        int rollNo;
        String name;
        int age;
        char grade;
        Student next;

        Student(int rollNo, String name, int age, char grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    Student head = null;

    // 1. Add at beginning
    void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // 2. Add at end
    void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newStudent = new Student(rollNo, name, age, grade);

        if (head == null) {
            head = newStudent;
            return;
        }

        Student temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newStudent;
    }

    // 3. Add at specific position (1-based index)
    void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // 4. Delete by Roll Number
    void deleteByRollNo(int rollNo) {
        if (head == null)
            return;

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student record deleted");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Student not found");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Student record deleted");
    }

    // 5. Search by Roll Number
    void searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // 6. Update grade
    void updateGrade(int rollNo, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // 7. Display all students
    void displayAll() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println(
                    "Roll No: " + temp.rollNo +
                            ", Name: " + temp.name +
                            ", Age: " + temp.age +
                            ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        srm.addAtBeginning(1, "Naveen", 20, 'A');
        srm.addAtEnd(2, "Rahul", 21, 'B');
        srm.addAtEnd(3, "Anita", 19, 'A');
        srm.addAtPosition(2, 4, "Kiran", 22, 'C');

        System.out.println("All Student Records:");
        srm.displayAll();

        System.out.println("\nSearching Roll No 2:");
        srm.searchByRollNo(2);

        System.out.println("\nUpdating Grade of Roll No 4:");
        srm.updateGrade(4, 'B');

        System.out.println("\nDeleting Roll No 1:");
        srm.deleteByRollNo(1);

        System.out.println("\nFinal Student Records:");
        srm.displayAll();
    }
}

