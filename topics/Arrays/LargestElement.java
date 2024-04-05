//Largest Element in Array Program
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element in the array: " + max);
    }
}
