//Remove Duplicate Elements from an Array
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        int n = arr.length;

        // Sort the array to bring duplicates together
        Arrays.sort(arr);

        // Remove duplicates by shifting elements
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1]; // Add the last element

        // Create a new array with unique elements
        int[] result = Arrays.copyOf(arr, j);

        System.out.print("Array with duplicates removed: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
