import java.util.Scanner;

//Create a program that checks whether a given array of integers is a palindrome or not
public class PalindromeArray {
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

        // Check if the array is a palindrome
        boolean isPalindrome = checkPalindrome(array);

        // Display the result
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if an array is a palindrome
    private static boolean checkPalindrome(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
/**
This program performs the following steps:

Takes input for the size of the array and the array elements.
Checks if the array is a palindrome.
Displays whether the array is a palindrome or not.
Compile and run this program, and you can input your own set of integers to check if the array is a palindrome or not.
*/