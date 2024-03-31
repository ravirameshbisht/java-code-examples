public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Reverse each word
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
            reversedSentence.append(reversedWord);
            if (i < words.length - 1) {
                reversedSentence.append(" ");
            }
        }
        
        // Output the reversed sentence
        System.out.println("Reversed Words in Sentence: " + reversedSentence.toString());
    }
}
