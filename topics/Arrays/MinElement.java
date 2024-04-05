//Find Minimum Element in Array Program
public class MinElement {
    public static void main(String[] args) {
        int[] arr = {8, 2, 10, 4, 5};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
    }
}
