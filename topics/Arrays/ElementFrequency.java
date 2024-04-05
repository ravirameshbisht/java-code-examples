import java.util.HashMap;
import java.util.Map;

//Crete a java program that demonstrates how to find the frequency of each element in an array
public class ElementFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3};

        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
/*
 * This program performs the following operations:

Initializes an array of integers.
Creates a HashMap to store element frequencies.
Calculates the frequency of each element in the array using a loop.
Displays the frequency of each element.
Compile and run this program, and you'll see the frequency of each element in the array printed to the console.

 */