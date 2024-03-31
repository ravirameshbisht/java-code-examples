public class StringBuilderExample {
    public static void main(String[] args) {
        // Concatenating strings using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String result = sb.toString();
        System.out.println("Concatenated String: " + result);

        // Appending different data types
        StringBuilder data = new StringBuilder();
        data.append("Name: ").append("John Doe").append(", ");
        data.append("Age: ").append(30).append(", ");
        data.append("Salary: ").append(50000.50);
        String employeeInfo = data.toString();
        System.out.println("Employee Information: " + employeeInfo);

        // Inserting into StringBuilder
        StringBuilder insertExample = new StringBuilder("The quick brown fox");
        insertExample.insert(10, "lazy ");
        System.out.println("After Insertion: " + insertExample);

        // Replacing in StringBuilder
        StringBuilder replaceExample = new StringBuilder("Java is fun");
        replaceExample.replace(8, 11, "awesome");
        System.out.println("After Replacement: " + replaceExample);

        // Deleting from StringBuilder
        StringBuilder deleteExample = new StringBuilder("This is a test string");
        deleteExample.delete(5, 7);
        System.out.println("After Deletion: " + deleteExample);

        // Reversing a string using StringBuilder
        String original = "hello";
        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println("Reversed String: " + reversed);
    }
}
