/**
 * This code demonstrates the creation, insertion, retrieval, removal, 
 * iteration, checking for the presence of keys, and clearing of a HashMap in Java.
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 28);

        // Accessing elements
        System.out.println("Age of John: " + hashMap.get("John"));

        // Checking if a key exists
        if (hashMap.containsKey("Alice")) {
            System.out.println("Alice is present in the HashMap.");
        }

        // Removing an element
        hashMap.remove("Bob");
        System.out.println("HashMap after removing Bob: " + hashMap);

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
/**  OUTPUT **

Age of John: 25
Alice is present in the HashMap.
HashMap after removing Bob: {Alice=30, John=25}
Alice : 30
John : 25
Size of HashMap: 2
HashMap after clearing: {}

 */