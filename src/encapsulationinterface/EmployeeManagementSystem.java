package EncapsulationInterface;

import java.util.*;

// Interface
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee implements Department {
    // Encapsulated fields
    private int employeeId;
    private String name;
    protected double baseSalary; // accessible to subclasses

    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + calculateSalary());
        System.out.println("--------------------------------");
    }

    // Encapsulation: getters & setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Interface method implementations
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
        super(employeeId, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // fixed monthly salary
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Polymorphism using Employee reference
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Naveen", 50000);
        e1.assignDepartment("IT");

        Employee e2 = new PartTimeEmployee(102, "Arun", 500, 80);
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Processing employees polymorphically
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
