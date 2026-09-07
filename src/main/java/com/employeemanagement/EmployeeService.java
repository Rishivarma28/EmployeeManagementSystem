package com.employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeService {

    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (id, name, email, department, salary) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, employee.getId());
            statement.setString(2, employee.getName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getDepartment());
            statement.setDouble(5, employee.getSalary());

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee added to database successfully!");
            } else {
                System.out.println("Employee was not added.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(int id, double salary) {

        String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setDouble(1, salary);
            statement.setInt(2, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee updated successfully!");
            } else {
                System.out.println("Employee ID not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("Employee ID not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayEmployees() {

        String sql = "SELECT * FROM employees";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             var resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                Employee employee = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("department"),
                        resultSet.getDouble("salary")
                );

                System.out.println(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}