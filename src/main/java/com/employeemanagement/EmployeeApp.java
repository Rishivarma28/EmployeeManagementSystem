package com.employeemanagement;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee Salary");
            System.out.println("3. Display Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(
                            id,
                            name,
                            email,
                            department,
                            salary
                    );

                    service.addEmployee(employee);
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();

                    service.updateEmployee(updateId, newSalary);
                    break;

                case 3:
                    service.displayEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();

                    service.deleteEmployee(deleteId);
                    break;

                case 5:
                    System.out.println("Thank you! Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
