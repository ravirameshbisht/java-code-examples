public class CharAtExample {
    public static void main(String[] args) {
        String str = "Hello World";

        // Accessing individual characters using charAt()
        char firstChar = str.charAt(0);
        char fifthChar = str.charAt(4);
        char lastChar = str.charAt(str.length() - 1);

        // Output the characters
        System.out.println("First character: " + firstChar);
        System.out.println("Fifth character: " + fifthChar);
        System.out.println("Last character: " + lastChar);
    }
}
