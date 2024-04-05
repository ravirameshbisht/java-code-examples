import java.util.Arrays;
import java.util.Scanner;

//create a program that sorts an array of strings in lexicographical (alphabetical) order
public class StringArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of strings in the array: ");
        int size = scanner.nextInt();

        // Consume newline character
        scanner.nextLine();

        // Declare an array of strings
        String[] strings = new String[size];

        // Input values into the array
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the array of strings
        Arrays.sort(strings);

        // Display the sorted array
        System.out.println("Sorted array of strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}

/*
 * This program performs the following steps:

Takes input for the size of the array and the array elements (strings).
Sorts the array of strings in lexicographical order using Arrays.sort() method.
Displays the sorted array of strings.
Compile and run this program, and you can input your own set of strings to see them sorted in lexicographical order.

 */