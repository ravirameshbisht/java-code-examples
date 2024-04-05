import java.util.Arrays;

//Create a java program that demonstrates how to remove duplicate elements from an array
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1};

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    // Method to remove duplicates from an array
    private static int[] removeDuplicates(int[] arr) {
        // Sort the array to bring duplicate elements together
        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;

        // Traverse the sorted array and copy non-duplicate elements to temp array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Copy the last element of the array
        temp[j++] = arr[arr.length - 1];

        // Create a new array with size equal to the number of non-duplicate elements
        int[] uniqueArray = new int[j];

        // Copy elements from temp array to uniqueArray
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }

        return uniqueArray;
    }
}

/*This program performs the following operations:

Initializes an array of integers with duplicate elements.
Removes duplicate elements from the array.
Prints the original array and the array after removing duplicates.
Compile and run this program, and you'll see the array before and after removing duplicates printed to the console.

*/