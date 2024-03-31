public class MoreStringOperations {
    public static void main(String[] args) {
        // Declaring and initializing strings
        String str = "Java Programming";

        // Accessing individual characters
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // Checking if starts or ends with a specific prefix/suffix
        boolean startsWithJava = str.startsWith("Java");
        boolean endsWithIng = str.endsWith("ing");
        System.out.println("Starts with 'Java': " + startsWithJava);
        System.out.println("Ends with 'ing': " + endsWithIng);

        // Checking for substring existence
        boolean containsProgram = str.contains("Program");
        System.out.println("Contains 'Program': " + containsProgram);

        // Replacing substrings
        String replacedStr = str.replace("Programming", "Code");
        System.out.println("String after replacement: " + replacedStr);

        // Converting string to character array
        char[] charArray = str.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Converting string to integer
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Parsed integer: " + number);

        // Concatenating strings using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java");
        stringBuilder.append(" ");
        stringBuilder.append("Programming");
        String concatenated = stringBuilder.toString();
        System.out.println("Concatenated String using StringBuilder: " + concatenated);

        // Reversing a string
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
