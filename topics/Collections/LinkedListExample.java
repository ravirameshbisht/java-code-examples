/**
 * This example demonstrates various operations such as adding elements 
 * at the beginning and end, removing elements, accessing first and last elements, 
 * checking for element existence, getting the size, and clearing the LinkedList.
 */
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Displaying the elements of the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst("Apricot");
        System.out.println("After adding at the beginning: " + linkedList);

        // Adding an element at the end
        linkedList.addLast("Fig");
        System.out.println("After adding at the end: " + linkedList);

        // Removing the first element
        linkedList.removeFirst();
        System.out.println("After removing the first element: " + linkedList);

        // Removing the last element
        linkedList.removeLast();
        System.out.println("After removing the last element: " + linkedList);

        // Getting the first element
        System.out.println("First element: " + linkedList.getFirst());

        // Getting the last element
        System.out.println("Last element: " + linkedList.getLast());

        // Checking if the LinkedList contains an element
        System.out.println("Contains 'Cherry'? " + linkedList.contains("Cherry"));

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // Removing a specific element
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList);

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);
    }
}
/** OUTPUT **

LinkedList: [Apple, Banana, Cherry, Date]
After adding at the beginning: [Apricot, Apple, Banana, Cherry, Date]
After adding at the end: [Apricot, Apple, Banana, Cherry, Date, Fig]
After removing the first element: [Apple, Banana, Cherry, Date, Fig]
After removing the last element: [Apple, Banana, Cherry, Date]
First element: Apple
Last element: Date
Contains 'Cherry'? true
Size of the LinkedList: 4
After removing 'Banana': [Apple, Cherry, Date]
After clearing the LinkedList: []

*/