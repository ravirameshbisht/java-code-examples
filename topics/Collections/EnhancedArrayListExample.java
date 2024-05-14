/*
    In this enhanced version:
    Additional methods addNamesDynamically and removeName are added 
    for adding elements dynamically and removing elements respectively
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class EnhancedArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(); // Creating ArrayList

        // Adding initial elements
        namesList.add("Jack");
        namesList.add("Tyler");

        // Displaying initial elements
        System.out.println("Initial list of names:");
        displayNames(namesList);

        // Adding more names dynamically
        addNamesDynamically(namesList);

        // Displaying final list of names
        System.out.println("Final list of names:");
        displayNames(namesList);

        // Removing a name
        removeName(namesList);

        // Displaying final list after removal
        System.out.println("List of names after removal:");
        displayNames(namesList);
    }

    // Method to display names in the list
    private static void displayNames(ArrayList<String> namesList) {
        Iterator<String> iterator = namesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to add names dynamically
    private static void addNamesDynamically(ArrayList<String> namesList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names to add (type 'done' to finish):");
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            namesList.add(name);
        }
    }

    // Method to remove a name from the list
    private static void removeName(ArrayList<String> namesList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name to remove:");
        String nameToRemove = scanner.nextLine();
        boolean removed = namesList.remove(nameToRemove);
        if (removed) {
            System.out.println(nameToRemove + " removed successfully.");
        } else {
            System.out.println(nameToRemove + " not found in the list.");
        }
    }
}
