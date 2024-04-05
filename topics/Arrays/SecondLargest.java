//Find the Second Largest Element in an Array
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 25, 30};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element in the array: " + secondMax);
        }
    }
}
