package java8features;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProcessing {

    // Employee Class
    static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return String.format("ID: %d | Name: %s | Dept: %s | Salary: $%.2f",
                    id, name, department, salary);
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Engineering", 95000),
                new Employee(2, "Bob", "HR", 60000),
                new Employee(3, "Charlie", "Engineering", 85000),
                new Employee(4, "David", "Engineering", 78000),
                new Employee(5, "Eva", "Finance", 90000),
                new Employee(6, "Frank", "Engineering", 120000)
        );

        // 1️⃣ Filter: Engineering department & salary > 80000
        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getDepartment().equals("Engineering") && e.getSalary() > 80000)
                .collect(Collectors.toList());

        System.out.println("\n1. Filtered Employees (Engineering & Salary > 80000):");
        filteredEmployees.forEach(System.out::println);

        // 2️⃣ Sort by salary in descending order
        List<Employee> sortedEmployees = filteredEmployees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("\n2. Sorted by Salary (Descending):");
        sortedEmployees.forEach(System.out::println);

        // 3️⃣ Group by department
        Map<String, List<Employee>> groupedByDepartment = sortedEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\n3. Grouped by Department:");
        groupedByDepartment.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(System.out::println);
        });

        // 4️⃣ Aggregate: Average salary per department
        Map<String, Double> averageSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println("\n4. Average Salary by Department:");
        averageSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> $" + avgSalary)
        );
    }
}
