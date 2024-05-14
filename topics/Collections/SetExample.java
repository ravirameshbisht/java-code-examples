import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("kiwi");

        // Displaying the elements
        System.out.println("Set: " + set);

        // Checking if an element is present
        System.out.println("Contains 'banana': " + set.contains("banana"));

        // Removing an element
        set.remove("orange");
        System.out.println("After removing 'orange': " + set);

        // Iterating over the set using forEach
        System.out.print("Elements using forEach: ");
        set.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // Getting the size of the set
        System.out.println("Size of the set: " + set.size());

        // Checking if the set is empty
        System.out.println("Is the set empty? " + set.isEmpty());

        // Creating another set for intersection and union
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("apple");
        anotherSet.add("grape");
        anotherSet.add("kiwi");

        // Performing intersection
        Set<String> intersection = new HashSet<>(set);
        intersection.retainAll(anotherSet);
        System.out.println("Intersection of the two sets: " + intersection);

        // Performing union
        Set<String> union = new HashSet<>(set);
        union.addAll(anotherSet);
        System.out.println("Union of the two sets: " + union);

        // Removing all elements
        set.clear();
        System.out.println("After clearing the set: " + set);
    }
}
