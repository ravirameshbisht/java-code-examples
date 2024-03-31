public class SubstringExample {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Extracting a substring from index 4 to 9 (inclusive start index, exclusive end index)
        String substring1 = sentence.substring(4, 10);
        System.out.println("Substring 1: " + substring1);

        // Extracting a substring from index 16 to the end of the string
        String substring2 = sentence.substring(16);
        System.out.println("Substring 2: " + substring2);

        // Extracting the last 4 characters of the string
        String substring3 = sentence.substring(sentence.length() - 4);
        System.out.println("Substring 3: " + substring3);

        // Extracting substrings based on specific criteria (e.g., finding words)
        String[] words = sentence.split("\\s+");
        System.out.println("\nWords in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
