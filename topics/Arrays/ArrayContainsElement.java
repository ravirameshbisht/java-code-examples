//Check if Array Contains a Specific Element Program
public class ArrayContainsElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean contains = false;

        for (int num : arr) {
            if (num == target) {
                contains = true;
                break;
            }
        }

        if (contains) {
            System.out.println("Array contains the element " + target);
        } else {
            System.out.println("Array does not contain the element " + target);
        }
    }
}
