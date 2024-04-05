import java.util.Scanner;

//create a Java program that allows a user to input values into an array 
//and then calculates the sum and average of those values
public class ArraySumAverage {
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

        // Calculate sum of elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average of elements
        double average = (double) sum / n;

        // Print sum and average
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}


/*
In this program:

We ask the user to input the number of elements they want in the array.
We declare an array of integers of size n.
We prompt the user to input n integers into the array.
We calculate the sum of all elements and then find the average.
Finally, we print out the sum and average.
Compile and run this program, and you can input your own set of integers to see the sum and average calculated.
*/