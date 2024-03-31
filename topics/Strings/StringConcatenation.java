public class StringConcatenation {
    public static void main(String[] args) {
        // Using the + operator for string concatenation
        String str1 = "Hello";
        String str2 = "World";
        String concatenated1 = str1 + ", " + str2;
        System.out.println("Concatenated String 1: " + concatenated1);

        // Using the concat() method
        String concatenated2 = str1.concat(", ").concat(str2);
        System.out.println("Concatenated String 2: " + concatenated2);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1).append(", ").append(str2);
        String concatenated3 = stringBuilder.toString();
        System.out.println("Concatenated String 3: " + concatenated3);
    }
}
