package constructorsinstancevariableaccessmodifiers.accessmodifiers;

// Base class
class Employee {

    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {

    String role;

    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Method demonstrating access to public and protected members
    void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID); // public
        System.out.println("Department  : " + department);  // protected
        System.out.println("Salary      : " + getSalary()); // private via getter
        System.out.println("Role        : " + role);
    }
}

// Main class
public class EmployeeRecords {

    public static void main(String[] args) {

        // Creating Manager object
        Manager mgr =
                new Manager(101, "IT", 60000, "Project Manager");

        // Display manager details
        mgr.displayManagerDetails();

        // Modify salary using public method
        mgr.setSalary(70000);

        System.out.println("\nAfter Salary Update:");
        mgr.displayManagerDetails();
    }
}
