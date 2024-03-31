import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatting {
    public static void main(String[] args) {
        // Formatting strings with placeholders
        String formatted = String.format("Hello, %s! You are %d years old.", "Alice", 30);
        System.out.println("Formatted String: " + formatted);

        // Padding numbers with leading zeros
        String paddedNumber = String.format("%06d", 123);
        System.out.println("Padded Number: " + paddedNumber);

        // Formatting floating-point numbers
        double num = 123.456789;
        String formattedFloat = String.format("%.2f", num);
        System.out.println("Formatted Float: " + formattedFloat);

        // Extracting numbers from a string using regular expressions
        String text = "The price is $10.99 and the discount is 20%";
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Numbers extracted from the text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Replacing substrings using regular expressions
        String replacedText = text.replaceAll("\\$\\d+(\\.\\d+)?", "[PRICE]");
        System.out.println("Text after replacement:");
        System.out.println(replacedText);
    }
}
