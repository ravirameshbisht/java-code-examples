import java.util.Scanner;

//Below is a simple CRUD (Create, Read, Update, Delete) application implemented using arrays in Java. 
//This application allows the user to perform basic CRUD operations on a collection of strings.
public class StringArrayCRUD {
    private static String[] strings = new String[10]; // Array to store strings
    private static int size = 0; // Current size of the array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCRUD Application Menu:");
            System.out.println("1. Create (Add new string)");
            System.out.println("2. Read (Display all strings)");
            System.out.println("3. Update (Modify a string)");
            System.out.println("4. Delete (Remove a string)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createString(scanner);
                    break;
                case 2:
                    readStrings();
                    break;
                case 3:
                    updateString(scanner);
                    break;
                case 4:
                    deleteString(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to add a new string to the array
    private static void createString(Scanner scanner) {
        if (size < strings.length) {
            System.out.print("Enter the string to add: ");
            String newString = scanner.nextLine();
            strings[size++] = newString;
            System.out.println("String added successfully.");
        } else {
            System.out.println("Array is full. Cannot add more strings.");
        }
    }

    // Method to display all strings in the array
    private static void readStrings() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Strings in the array:");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + strings[i]);
            }
        }
    }

    // Method to modify a string in the array
    private static void updateString(Scanner scanner) {
        System.out.print("Enter the index of the string to modify (1-" + size + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 1 && index <= size) {
            System.out.print("Enter the new string: ");
            String newString = scanner.nextLine();
            strings[index - 1] = newString;
            System.out.println("String modified successfully.");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    // Method to remove a string from the array
    private static void deleteString(Scanner scanner) {
        if (size == 0) {
            System.out.println("Array is empty. No strings to delete.");
            return;
        }

        System.out.print("Enter the index of the string to delete (1-" + size + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 1 && index <= size) {
            for (int i = index - 1; i < size - 1; i++) {
                strings[i] = strings[i + 1];
            }
            strings[size - 1] = null;
            size--;
            System.out.println("String deleted successfully.");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }
}
/*
 * This CRUD application allows the user to perform the following operations on a collection of strings:

Create (Add new string): Add a new string to the collection.
Read (Display all strings): Display all strings currently in the collection.
Update (Modify a string): Modify an existing string in the collection.
Delete (Remove a string): Remove an existing string from the collection.
Exit: Exit the application.

 */