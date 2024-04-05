//Copy Elements from One Array to Another
public class CopyArray {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        System.out.print("Destination array: ");
        for (int num : destination) {
            System.out.print(num + " ");
        }
    }
}
