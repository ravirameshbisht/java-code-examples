public class StringReplaceExample {
    public static void main(String[] args) {
        String originalString = "Hello, World! Hello, Java!";

        // Replace occurrences of a character
        String replacedChar = originalString.replace('l', '*');
        System.out.println("String after replacing 'l' with '*': " + replacedChar);

        // Replace occurrences of a substring
        String replacedSubstring = originalString.replace("Hello", "Hi");
        System.out.println("String after replacing 'Hello' with 'Hi': " + replacedSubstring);

        // Replace all occurrences of a substring
        String replacedAll = originalString.replaceAll("Hello", "Hi");
        System.out.println("String after replacing all occurrences of 'Hello' with 'Hi': " + replacedAll);

        // Replace using regular expression
        String replacedRegex = originalString.replaceAll("[aeiou]", "*");
        System.out.println("String after replacing vowels with '*': " + replacedRegex);
    }
}
