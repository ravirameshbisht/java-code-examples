public class StringComparisonIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";

        // Comparing strings while ignoring case
        boolean isEqualIgnoreCase1 = str1.equalsIgnoreCase(str2);
        System.out.println("str1 equalsIgnoreCase str2: " + isEqualIgnoreCase1);

        boolean isEqualIgnoreCase2 = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equalsIgnoreCase str3: " + isEqualIgnoreCase2);
    }
}
