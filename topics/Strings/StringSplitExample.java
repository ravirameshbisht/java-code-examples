public class StringSplitExample {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Splitting the sentence into words based on spaces
        String[] words = sentence.split(" ");

        // Output the words
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Splitting the sentence into words based on any whitespace characters
        String[] wordsWhitespace = sentence.split("\\s+");

        // Output the words
        System.out.println("\nWords in the sentence (using whitespace delimiter):");
        for (String word : wordsWhitespace) {
            System.out.println(word);
        }

        // Splitting the sentence into words based on non-word characters
        String[] wordsNonWord = sentence.split("\\W+");

        // Output the words
        System.out.println("\nWords in the sentence (using non-word delimiter):");
        for (String word : wordsNonWord) {
            System.out.println(word);
        }
    }
}
