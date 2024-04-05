import java.util.Scanner;

//create a program that finds the second largest element in an array of integers
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of integers
        int[] array = new int[size];

        // Input values into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the second largest element
        int secondLargest = findSecondLargest(array);

        // Display the second largest element
        System.out.println("The second largest element in the array is: " + secondLargest);

        scanner.close();
    }

    // Method to find the second largest element in an array
    private static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

/*This program performs the following steps:

Takes input for the size of the array and the array elements.
Finds the second largest element in the array.
Displays the second largest element.
Compile and run this program, and you can input your own set of integers to find the second largest element in the array.

 */