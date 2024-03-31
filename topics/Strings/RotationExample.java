public class RotationExample {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";
        String str3 = "world";

        // Check if str1 is a rotation of str2
        boolean isRotation1 = isRotation(str1, str2);
        System.out.println(str1 + " is a rotation of " + str2 + ": " + isRotation1);

        // Check if str1 is a rotation of str3
        boolean isRotation2 = isRotation(str1, str3);
        System.out.println(str1 + " is a rotation of " + str3 + ": " + isRotation2);
    }

    // Method to check if one string is a rotation of another string
    private static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str2 + str2;
        return concatenated.contains(str1);
    }
}
