package csvdatahandling;

import java.sql.*;
import java.io.*;



public class DBToCSVReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String username = "root";
        String password = "root";

        String outputFile = "src\\csvdatahandling\\csvfiles\\employee_report.csv";

        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Write header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            while (rs.next()) {
                bw.write(
                        rs.getInt("id") + "," +
                                rs.getString("name") + "," +
                                rs.getString("department") + "," +
                                rs.getDouble("salary")
                );
                bw.newLine();
            }

            System.out.println("CSV Report Generated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
