import java.util.Scanner;

//create a Java program that demonstrates various operations with arrays, 
//including initialization, traversal, modification, and printing
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array of size 5
        int[] numbers = new int[5];

        // Input values into the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        System.out.print("Enter the index to modify (0-4): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < 5) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();
            numbers[index] = newValue;
            System.out.println("Element at index " + index + " modified successfully.");
        } else {
            System.out.println("Invalid index. Modification failed.");
        }

        // Print the modified array
        System.out.println("The modified elements of the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}

/*
 * This program performs the following operations with arrays:

Initializes an array of integers of size 5.
Inputs values into the array.
Prints the elements of the array.
Modifies an element in the array based on user input.
Prints the modified array.
Compile and run this program, and you can input 5 integers and modify an element to see the array operations in action.

 */