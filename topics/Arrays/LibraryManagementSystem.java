import java.util.Scanner;

public class LibraryManagementSystem {
    private static final int MAX_BOOKS = 100;
    private static String[] titles = new String[MAX_BOOKS];
    private static String[] authors = new String[MAX_BOOKS];
    private static String[] genres = new String[MAX_BOOKS];
    private static int[] years = new int[MAX_BOOKS];
    private static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Update Book Information");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    searchBookByTitle(scanner);
                    break;
                case 4:
                    updateBookInformation(scanner);
                    break;
                case 5:
                    deleteBook(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // Method to add a book to the library
    private static void addBook(Scanner scanner) {
        if (bookCount < MAX_BOOKS) {
            System.out.print("Enter title of the book: ");
            String title = scanner.nextLine();

            System.out.print("Enter author of the book: ");
            String author = scanner.nextLine();

            System.out.print("Enter genre of the book: ");
            String genre = scanner.nextLine();

            System.out.print("Enter year of publication: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            titles[bookCount] = title;
            authors[bookCount] = author;
            genres[bookCount] = genre;
            years[bookCount] = year;
            bookCount++;

            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to display all books in the library
    private static void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("Library is empty. No books to display.");
        } else {
            System.out.println("All Books in the Library:");
            System.out.println("Title\t\tAuthor\t\tGenre\t\tYear");
            System.out.println("----------------------------------------------");
            for (int i = 0; i < bookCount; i++) {
                System.out.printf("%-15s%-15s%-15s%-8d\n", titles[i], authors[i], genres[i], years[i]);
            }
        }
    }

    // Method to search for a book by title
    private static void searchBookByTitle(Scanner scanner) {
        System.out.print("Enter title of the book to search: ");
        String searchTitle = scanner.nextLine();

        boolean bookFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(searchTitle)) {
                bookFound = true;
                System.out.println("Book found:");
                System.out.println("Title: " + titles[i]);
                System.out.println("Author: " + authors[i]);
                System.out.println("Genre: " + genres[i]);
                System.out.println("Year: " + years[i]);
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book with title \"" + searchTitle + "\" not found.");
        }
    }

    // Method to update book information
    private static void updateBookInformation(Scanner scanner) {
        System.out.print("Enter title of the book to update: ");
        String updateTitle = scanner.nextLine();

        boolean bookFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(updateTitle)) {
                bookFound = true;
                System.out.print("Enter updated author of the book: ");
                String updatedAuthor = scanner.nextLine();

                System.out.print("Enter updated genre of the book: ");
                String updatedGenre = scanner.nextLine();

                System.out.print("Enter updated year of publication: ");
                int updatedYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                authors[i] = updatedAuthor;
                genres[i] = updatedGenre;
                years[i] = updatedYear;
                System.out.println("Book information updated successfully.");
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book with title \"" + updateTitle + "\" not found. Cannot update.");
        }
    }

    // Method to delete a book from the library
    private static void deleteBook(Scanner scanner) {
        System.out.print("Enter title of the book to delete: ");
        String deleteTitle = scanner.nextLine();

        boolean bookFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(deleteTitle)) {
                bookFound = true;
                for (int j = i; j < bookCount - 1; j++) {
                    titles[j] = titles[j + 1];
                    authors[j] = authors[j + 1];
                    genres[j] = genres[j + 1];
                    years[j] = years[j + 1];
                }
                bookCount--;
                System.out.println("Book with title \"" + deleteTitle + "\" deleted successfully.");
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book with title \"" + deleteTitle + "\" not found. Cannot delete.");
        }
    }
}
/*
 * This Library Management System allows the user to perform the following operations:

Add Book: Add a new book to the library with title, author, genre, and year of publication.
Display All Books: Display all books currently stored in the library.
Search Book by Title: Search for a book by its title and display its information.
Update Book Information: Update the author, genre, and year of publication of a book based on its title.
Delete Book: Delete a book from the library based on its title.
Exit: Exit the Library Management System.
Compile and run this program, and you can manage a library's collection of books effectively.

 */