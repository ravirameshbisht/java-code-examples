import java.util.Scanner;

public class StudentManagementSystem {
    private static final int MAX_STUDENTS = 100;
    private static int[] studentIds = new int[MAX_STUDENTS];
    private static String[] studentNames = new String[MAX_STUDENTS];
    private static int[] studentAges = new int[MAX_STUDENTS];
    private static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentById(scanner);
                    break;
                case 4:
                    updateStudentInformation(scanner);
                    break;
                case 5:
                    deleteStudent(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // Method to add a student to the system
    private static void addStudent(Scanner scanner) {
        if (studentCount < MAX_STUDENTS) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            studentIds[studentCount] = id;
            studentNames[studentCount] = name;
            studentAges[studentCount] = age;
            studentCount++;

            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student database is full. Cannot add more students.");
        }
    }

    // Method to display all students
    private static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display. Student database is empty.");
        } else {
            System.out.println("All Students:");
            System.out.println("ID\tName\tAge");
            System.out.println("-------------------");
            for (int i = 0; i < studentCount; i++) {
                System.out.println(studentIds[i] + "\t" + studentNames[i] + "\t" + studentAges[i]);
            }
        }
    }

    // Method to search for a student by ID
    private static void searchStudentById(Scanner scanner) {
        System.out.print("Enter student ID to search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean studentFound = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentIds[i] == searchId) {
                studentFound = true;
                System.out.println("Student found:");
                System.out.println("ID: " + studentIds[i]);
                System.out.println("Name: " + studentNames[i]);
                System.out.println("Age: " + studentAges[i]);
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }

    // Method to update student information
    private static void updateStudentInformation(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        int updateId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean studentFound = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentIds[i] == updateId) {
                studentFound = true;
                System.out.print("Enter updated name: ");
                String updatedName = scanner.nextLine();

                System.out.print("Enter updated age: ");
                int updatedAge = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                studentNames[i] = updatedName;
                studentAges[i] = updatedAge;
                System.out.println("Student information updated successfully.");
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + updateId + " not found. Cannot update.");
        }
    }

    // Method to delete a student from the system
    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean studentFound = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentIds[i] == deleteId) {
                studentFound = true;
                for (int j = i; j < studentCount - 1; j++) {
                    studentIds[j] = studentIds[j + 1];
                    studentNames[j] = studentNames[j + 1];
                    studentAges[j] = studentAges[j + 1];
                }
                studentCount--;
                System.out.println("Student with ID " + deleteId + " deleted successfully.");
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + deleteId + " not found. Cannot delete.");
        }
    }
}
/*
 * This Student Management System allows the user to perform the following operations:

Add Student: Add a new student to the system with ID, name, and age.
Display All Students: Display all students currently stored in the system.
Search Student by ID: Search for a student by their ID and display their information.
Update Student Information: Update the name and age of a student based on their ID.
Delete Student: Delete a student from the system based on their ID.
Exit: Exit the Student Management System.
Compile and run this program, and you can manage student information effectively.

 */