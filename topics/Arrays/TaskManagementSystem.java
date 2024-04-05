import java.util.Scanner;

//Create a java program that simulates a basic task management system using arrays. 
//The program allows users to add tasks, mark tasks as completed, 
//display all tasks, and delete tasks
public class TaskManagementSystem {
    private static final int MAX_TASKS = 100;
    private static String[] tasks = new String[MAX_TASKS];
    private static boolean[] completed = new boolean[MAX_TASKS];
    private static int taskCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Management System Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    markTaskAsCompleted(scanner);
                    break;
                case 3:
                    displayAllTasks();
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the Task Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to add a task
    private static void addTask(Scanner scanner) {
        if (taskCount < MAX_TASKS) {
            System.out.print("Enter the task description: ");
            String taskDescription = scanner.nextLine();

            tasks[taskCount] = taskDescription;
            completed[taskCount] = false;
            taskCount++;

            System.out.println("Task added successfully.");
        } else {
            System.out.println("Task list is full. Cannot add more tasks.");
        }
    }

    // Method to mark a task as completed
    private static void markTaskAsCompleted(Scanner scanner) {
        if (taskCount == 0) {
            System.out.println("No tasks to mark as completed. Task list is empty.");
            return;
        }

        System.out.println("Select the task to mark as completed (enter the task number):");
        displayAllTasks();
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("Invalid task number. Please enter a valid task number.");
        } else {
            completed[taskNumber - 1] = true;
            System.out.println("Task marked as completed.");
        }
    }

    // Method to display all tasks
    private static void displayAllTasks() {
        if (taskCount == 0) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("All Tasks:");
            for (int i = 0; i < taskCount; i++) {
                System.out.printf("%d. [%s] %s\n", i + 1, completed[i] ? "X" : " ", tasks[i]);
            }
        }
    }

    // Method to delete a task
    private static void deleteTask(Scanner scanner) {
        if (taskCount == 0) {
            System.out.println("No tasks to delete. Task list is empty.");
            return;
        }

        System.out.println("Select the task to delete (enter the task number):");
        displayAllTasks();
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("Invalid task number. Please enter a valid task number.");
        } else {
            for (int i = taskNumber - 1; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
                completed[i] = completed[i + 1];
            }
            taskCount--;
            System.out.println("Task deleted successfully.");
        }
    }
}
/*
 * This Task Management System allows the user to perform the following operations:

Add Task: Add a new task to the task list.
Mark Task as Completed: Mark a task as completed.
Display All Tasks: Display all tasks in the task list along with their completion status.
Delete Task: Delete a task from the task list.
Exit: Exit the Task Management System.
Compile and run this program, and you can manage your tasks effectively.

 */