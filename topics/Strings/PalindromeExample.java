public class PalindromeExample {
    public static void main(String[] args) {
        String str1 = "radar";
        String str2 = "hello";

        // Check if str1 is a palindrome
        boolean isPalindrome1 = isPalindrome(str1);
        System.out.println(str1 + " is a palindrome: " + isPalindrome1);

        // Check if str2 is a palindrome
        boolean isPalindrome2 = isPalindrome(str2);
        System.out.println(str2 + " is a palindrome: " + isPalindrome2);
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
