public class StartEndExample {
    public static void main(String[] args) {
        String str = "Hello World";

        // Checking if the string starts with a specific prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Checking if the string ends with a specific suffix
        boolean endsWithWorld = str.endsWith("World");
        System.out.println("Ends with 'World': " + endsWithWorld);

        // Ignoring case while checking for startsWith and endsWith
        boolean startsWithHelloIgnoreCase = str.toLowerCase().startsWith("hello");
        boolean endsWithWorldIgnoreCase = str.toLowerCase().endsWith("world");
        System.out.println("Starts with 'hello' (ignore case): " + startsWithHelloIgnoreCase);
        System.out.println("Ends with 'world' (ignore case): " + endsWithWorldIgnoreCase);
    }
}
