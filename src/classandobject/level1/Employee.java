package classandobject.level1;

public class Employee {
    String name;
    int id;
    double salary;
    /*
     * Method to display employee details
     */
    public void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();
        // Assigning values
        emp.name = "Ravi";
        emp.id = 101;
        emp.salary = 45000;

        // Displaying details
        emp.displayDetails();

    }
}
