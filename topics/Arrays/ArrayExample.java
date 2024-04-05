import java.util.Arrays;

//write a Java program that demonstrates the use of arrays
public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {5, 2, 9, 1, 3};

        // Print the elements of the array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("\nSorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Find the sum of all elements in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of all elements: " + sum);

        // Find the maximum element in the array
        int max = numbers[numbers.length - 1];
        System.out.println("Maximum element: " + max);

        // Find the average of all elements in the array
        double average = (double) sum / numbers.length;
        System.out.println("Average of all elements: " + average);
    }
}

/*

This program demonstrates the following operations with arrays:

Declaring and initializing an array.
Printing the elements of the array.
Sorting the array in ascending order.
Finding the sum of all elements in the array.
Finding the maximum element in the array.
Finding the average of all elements in the array.
You can compile and run this program to see the output.

*/