/*
 * This program defines an Employee class to represent an employee 
 * with attributes like name, age, and department. 
 * It uses a HashMap to store employees 
 * where the key is the employee ID and the 
 * value is the Employee object. 
 * The main method provides a simple menu-driven interface 
 * for adding, removing, updating, and displaying employee details.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}

public class EmployeeManagement {
    private static Map<Integer, Employee> employeeMap = new HashMap<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display Employee Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    removeEmployee(scanner);
                    break;
                case 3:
                    updateEmployee(scanner);
                    break;
                case 4:
                    displayEmployeeDetails();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        Employee employee = new Employee(name, age, department);
        employeeMap.put(nextId, employee);
        System.out.println("Employee added with ID: " + nextId);
        nextId++;
    }

    private static void removeEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Employee with ID " + id + " removed successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private static void updateEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (employeeMap.containsKey(id)) {
            System.out.print("Enter updated employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter updated employee age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter updated employee department: ");
            String department = scanner.nextLine();

            Employee updatedEmployee = new Employee(name, age, department);
            employeeMap.put(id, updatedEmployee);
            System.out.println("Employee with ID " + id + " updated successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private static void displayEmployeeDetails() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Details:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }
}
