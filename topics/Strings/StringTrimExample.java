public class StringTrimExample {
    public static void main(String[] args) {
        // String with leading and trailing whitespace
        String stringWithSpaces = "   Hello World   ";

        // Using trim() method to remove leading and trailing whitespace
        String trimmedString = stringWithSpaces.trim();

        // Output the original and trimmed strings
        System.out.println("Original String: '" + stringWithSpaces + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
