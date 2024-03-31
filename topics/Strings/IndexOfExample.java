public class IndexOfExample {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        // Finding the index of a specific character
        int index1 = str.indexOf('o');
        System.out.println("Index of 'o': " + index1);

        // Finding the index of a specific character starting from a given index
        int index2 = str.indexOf('o', 10);
        System.out.println("Index of 'o' after index 10: " + index2);

        // Finding the index of a specific substring
        int index3 = str.indexOf("brown");
        System.out.println("Index of 'brown': " + index3);

        // Finding the index of a specific substring starting from a given index
        int index4 = str.indexOf("lazy", 20);
        System.out.println("Index of 'lazy' after index 20: " + index4);
    }
}
