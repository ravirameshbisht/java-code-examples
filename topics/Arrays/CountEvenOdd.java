//Count Even and Odd Numbers in an Array
public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
