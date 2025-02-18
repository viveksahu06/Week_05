package com.csvdatahandling.advanceproblem.generateacsvreportfromdatabase;

import java.sql.*;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeCSVReport {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "password";
        String csvFile = "src/main/java/com/csvdatahandling/advancedproblems/generateacsvreportfromdatabase/file.csv";

        String query = "SELECT id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             FileWriter writer = new FileWriter(csvFile)) {

            writer.append("Employee ID,Name,Department,Salary\n");

            while (rs.next()) {
                writer.append(rs.getInt("id") + ",")
                        .append(rs.getString("name") + ",")
                        .append(rs.getString("department") + ",")
                        .append(rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV report generated successfully!");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}

