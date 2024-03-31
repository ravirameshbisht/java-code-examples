public class SubstringCheckExample {
    public static void main(String[] args) {
        String mainString = "The quick brown fox jumps over the lazy dog";

        // Check if the string contains a specific substring
        String substring1 = "brown";
        boolean containsSubstring1 = mainString.contains(substring1);
        System.out.println("Contains '" + substring1 + "': " + containsSubstring1);

        // Check if the string contains another specific substring
        String substring2 = "cat";
        boolean containsSubstring2 = mainString.contains(substring2);
        System.out.println("Contains '" + substring2 + "': " + containsSubstring2);
    }
}
