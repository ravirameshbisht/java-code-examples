import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//create a Java program that finds the intersection of two arrays, 
//i.e., it finds the common elements present in both arrays
public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Input the elements of the first array
        int[] array1 = inputArray(scanner, size1);

        // Input the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Input the elements of the second array
        int[] array2 = inputArray(scanner, size2);

        // Find the intersection of the two arrays
        int[] intersection = findIntersection(array1, array2);

        // Display the intersection
        System.out.println("Intersection of the two arrays:");
        displayArray(intersection);

        scanner.close();
    }

    // Method to input elements into an array
    private static int[] inputArray(Scanner scanner, int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Method to find the intersection of two arrays
    private static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        ArrayList<Integer> intersectionList = new ArrayList<>();
        for (int num : array2) {
            if (set.contains(num)) {
                intersectionList.add(num);
                set.remove(num); // Ensures duplicates are not added to intersection
            }
        }

        // Convert ArrayList to array
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }

    // Method to display an array
    private static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/*
 * This program performs the following steps:

Takes input for the size and elements of two arrays.
Finds the intersection of the two arrays.
Displays the intersection of the arrays.
Compile and run this program, and you can input your own sets of integers to see the intersection of the arrays.
 */