public class StringTokenization {
    public static void main(String[] args) {
        // Tokenizing a string using split() method
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Tokenizing a string with multiple delimiters
        String data = "apple,orange;banana mango";
        String[] items = data.split("[,;\\s]+");
        System.out.println("\nItems:");
        for (String item : items) {
            System.out.println(item);
        }

        // Tokenizing a string with a limited number of tokens
        String numbers = "1,2,3,4,5";
        String[] parts = numbers.split(",", 3);
        System.out.println("\nParts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Tokenizing a string and extracting specific parts
        String info = "Name: John, Age: 30, City: New York";
        String[] keyValuePairs = info.split(",\\s*");
        System.out.println("\nKey-Value Pairs:");
        for (String pair : keyValuePairs) {
            String[] keyValue = pair.split(":\\s*");
            if (keyValue.length == 2) {
                String key = keyValue[0];
                String value = keyValue[1];
                System.out.println(key + " = " + value);
            }
        }
    }
}
