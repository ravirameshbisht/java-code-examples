import java.util.Arrays;

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";

        // Check if str1 is an anagram of str2
        boolean isAnagram1 = isAnagram(str1, str2);
        System.out.println(str1 + " is an anagram of " + str2 + ": " + isAnagram1);

        // Check if str1 is an anagram of str3
        boolean isAnagram2 = isAnagram(str1, str3);
        System.out.println(str1 + " is an anagram of " + str3 + ": " + isAnagram2);
    }

    // Method to check if two strings are anagrams
    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
