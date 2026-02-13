package csvdatahandling.csvfiles;

import java.io.*;
import java.util.*;

class Employee {
    String id, name, department;
    double salary;

    Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class SortEmployees {

    public static void main(String[] args) throws IOException {

        String filePath = "src\\csvdatahandling\\csvfiles\\employee.csv";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine(); // skip header

        List<Employee> employees = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            employees.add(new Employee(
                    data[0],
                    data[1],
                    data[2],
                    Double.parseDouble(data[3])
            ));
        }

        br.close();

        // Sort descending by salary
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("Top 5 Highest Paid Employees:");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(e.name + " - " + e.salary);
        }
    }
}
