public class StringComparison {
    public static void main(String[] args) {
        // String comparison
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "Apple";

        // Compare using equals() method
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        // Compare ignoring case
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equalsIgnoreCase str3: " + isEqualIgnoreCase);

        // Compare using compareTo() method
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("str1 comes before str2");
        } else if (comparisonResult > 0) {
            System.out.println("str1 comes after str2");
        } else {
            System.out.println("str1 and str2 are equal");
        }

        // String manipulation
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Convert to uppercase
        String upperCase = sentence.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert to lowercase
        String lowerCase = sentence.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // Trim leading and trailing whitespaces
        String stringWithSpaces = "   Hello World   ";
        String trimmed = stringWithSpaces.trim();
        System.out.println("Trimmed: " + trimmed);

        // Replace characters
        String replaced = sentence.replace('o', '*');
        System.out.println("Replaced: " + replaced);

        // Split string
        String[] words = sentence.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Joining strings
        String[] fruits = {"Apple", "Banana", "Orange"};
        String joined = String.join(", ", fruits);
        System.out.println("Joined: " + joined);
    }
}
