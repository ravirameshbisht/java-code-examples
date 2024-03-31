import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // Tokenizing a string using StringTokenizer
        String sentence = "The quick brown fox jumps over the lazy dog";
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        // Tokenizing a string with custom delimiters
        String data = "apple,orange,banana,mango";
        StringTokenizer tokenizer2 = new StringTokenizer(data, ",");
        System.out.println("\nFruits:");
        while (tokenizer2.hasMoreTokens()) {
            String fruit = tokenizer2.nextToken();
            System.out.println(fruit);
        }

        // Tokenizing a string with multiple delimiters
        String data2 = "apple,orange;banana mango";
        StringTokenizer tokenizer3 = new StringTokenizer(data2, ",; ");
        System.out.println("\nItems:");
        while (tokenizer3.hasMoreTokens()) {
            String item = tokenizer3.nextToken();
            System.out.println(item);
        }

        // Counting tokens
        String sentence2 = "This is a test sentence";
        StringTokenizer tokenizer4 = new StringTokenizer(sentence2);
        int tokenCount = tokenizer4.countTokens();
        System.out.println("\nToken count: " + tokenCount);

        // Reconstructing a string from tokens
        StringBuilder reconstructed = new StringBuilder();
        while (tokenizer4.hasMoreTokens()) {
            reconstructed.append(tokenizer4.nextToken()).append(" ");
        }
        String reconstructedSentence = reconstructed.toString().trim();
        System.out.println("Reconstructed Sentence: " + reconstructedSentence);
    }
}
