/**
 * This program allows you to perform CRUD operations on employee records 
 * using an ArrayList. You can add, display, update, and delete employees.
 */
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeManagementUsingArrayList {
    private ArrayList<Employee> employees;
    private int nextId;

    public EmployeeManagementUsingArrayList() {
        employees = new ArrayList<>();
        nextId = 1; // Start employee IDs from 1
    }

    public void addEmployee(String name, double salary) {
        employees.add(new Employee(nextId++, name, salary));
    }

    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }

    public void updateEmployeeSalary(int id, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setSalary(newSalary);
                System.out.println("Employee salary updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementUsingArrayList management = new EmployeeManagementUsingArrayList();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    management.addEmployee(name, salary);
                    break;
                case 2:
                    management.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int idToUpdate = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    management.updateEmployeeSalary(idToUpdate, newSalary);
                    break;
                case 4:
                    System.out.print("Enter employee ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    management.deleteEmployee(idToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
