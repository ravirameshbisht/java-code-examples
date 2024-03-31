public class StringOperations {
    public static void main(String[] args) {
        // Declaring and initializing strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        // Length of a string
        int length = combined.length();
        System.out.println("Length of the String: " + length);

        // Extracting substring
        String sub = combined.substring(6, 11);
        System.out.println("Substring: " + sub);

        // Converting to uppercase
        String upper = combined.toUpperCase();
        System.out.println("Uppercase String: " + upper);

        // Converting to lowercase
        String lower = combined.toLowerCase();
        System.out.println("Lowercase String: " + lower);

        // Checking if contains a substring
        boolean contains = combined.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Checking equality
        boolean isEqual = str1.equals(str2);
        System.out.println("Strings are equal: " + isEqual);

        // Checking equality ignoring case
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println("Strings are equal ignoring case: " + isEqualIgnoreCase);

        // Finding index of a character
        int index = combined.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // Checking if empty
        boolean isEmpty = str1.isEmpty();
        System.out.println("String is empty: " + isEmpty);

        // Removing leading and trailing whitespaces
        String stringWithSpaces = "   Hello World   ";
        String trimmed = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmed);

        // Splitting a string
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Replacing characters
        String replaced = sentence.replace('o', '*');
        System.out.println("String after replacing 'o' with '*': " + replaced);
    }
}
