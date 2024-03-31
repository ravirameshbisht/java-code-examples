import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args) {
        // Matching a pattern in a string
        String text = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Pattern 'fox' found");
        } else {
            System.out.println("Pattern 'fox' not found");
        }

        // Finding multiple occurrences of a pattern
        String text2 = "apple, banana, cherry, date";
        Pattern pattern2 = Pattern.compile("\\w+");
        Matcher matcher2 = pattern2.matcher(text2);
        System.out.println("Words in the text:");
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        // Extracting numbers from a string using regular expressions
        String text3 = "The price is $10.99 and the discount is 20%";
        Pattern pattern3 = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher3 = pattern3.matcher(text3);
        System.out.println("Numbers extracted from the text:");
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }

        // Using groups to extract specific parts of a pattern
        String text4 = "Name: John, Age: 30, City: New York";
        Pattern pattern4 = Pattern.compile("Name: (\\w+), Age: (\\d+), City: (\\w+ \\w+)");
        Matcher matcher4 = pattern4.matcher(text4);
        if (matcher4.find()) {
            System.out.println("Name: " + matcher4.group(1));
            System.out.println("Age: " + matcher4.group(2));
            System.out.println("City: " + matcher4.group(3));
        }
    }
}
