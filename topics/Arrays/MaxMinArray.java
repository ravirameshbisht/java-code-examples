import java.util.Scanner;

//Create a Java program that finds the maximum and minimum elements in an array of integers
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare an array of size n
        int[] numbers = new int[n];

        // Input values into the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find maximum and minimum elements
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}

/*
In this program:

We ask the user to input the number of elements they want in the array.
We declare an array of integers of size n.
We prompt the user to input n integers into the array.
We iterate through the array to find the maximum and minimum elements.
Finally, we print out the maximum and minimum elements.
Compile and run this program, and you can input your own set of integers to see the maximum and minimum elements found.

*/