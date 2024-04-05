//Find Duplicate Elements in an Array
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5, 2};
        boolean foundDuplicate = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    foundDuplicate = true;
                    System.out.println("Duplicate elements found: " + arr[i]);
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found in the array.");
        }
    }
}
