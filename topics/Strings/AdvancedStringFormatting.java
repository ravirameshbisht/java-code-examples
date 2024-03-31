public class AdvancedStringFormatting {
    public static void main(String[] args) {
        // Formatting integers
        int num1 = 123;
        String formattedInt = String.format("Number: %05d", num1);
        System.out.println("Formatted Integer: " + formattedInt);

        // Formatting floating-point numbers
        double num2 = 123.456789;
        String formattedDouble = String.format("Number: %.2f", num2);
        System.out.println("Formatted Double: " + formattedDouble);

        // Formatting dates
        long timestamp = System.currentTimeMillis();
        String formattedDate = String.format("Date: %tF", timestamp);
        System.out.println("Formatted Date: " + formattedDate);

        // Formatting currency
        double price = 99.99;
        String formattedCurrency = String.format("Price: $%,.2f", price);
        System.out.println("Formatted Currency: " + formattedCurrency);

        // Formatting hexadecimal numbers
        int hexNumber = 255;
        String formattedHex = String.format("Hex: %X", hexNumber);
        System.out.println("Formatted Hex: " + formattedHex);

        // Formatting scientific notation
        double scientificNumber = 1234567890.123456789;
        String formattedScientific = String.format("Scientific Notation: %.2e", scientificNumber);
        System.out.println("Formatted Scientific Notation: " + formattedScientific);
    }
}
