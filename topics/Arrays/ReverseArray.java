import java.util.Arrays;

//Create a java program that demonstrates how to reverse an array
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Reverse the array
        reverse(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move start and end pointers towards the center
            start++;
            end--;
        }
    }
}
/*
 * This program performs the following operations:

Initializes an array of integers.
Prints the original array.
Reverses the array using a method called reverse().
Prints the reversed array.
Compile and run this program, and you'll see the original array and the reversed array printed to the console.

 */