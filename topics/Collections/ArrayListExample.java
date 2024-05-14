/**
 * This example demonstrates creating an ArrayList, 
 * adding elements, accessing elements by index, 
 * iterating through the list, removing elements, 
 * checking if an element exists, getting the size of the list, 
 * clearing the list, and checking if the list is empty.
 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("Fruits: " + fruits);

        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Checking if an element exists
        System.out.println("Does the list contain Banana? " + fruits.contains("Banana"));

        // Getting the size of the ArrayList
        System.out.println("Size of the list: " + fruits.size());

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);

        // Checking if the ArrayList is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());
    }
}

/** OUTPUT **
 
Fruits: [Apple, Banana, Orange]
First fruit: Apple
Iterating through the ArrayList:
Apple
Banana
Orange
After removing Banana: [Apple, Orange]
Does the list contain Banana? false
Size of the list: 2
After clearing the list: []
Is the list empty? true

*/