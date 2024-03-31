import java.util.HashMap;
import java.util.Map;

public class CharacterCountExample {
    public static void main(String[] args) {
        String str = "hello world";

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count occurrences of each character
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Display the character counts
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
