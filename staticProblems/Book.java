package staticProblems;

public class Book {

    // Static variable shared by all Book objects
    private static String libraryName = "City Central Library";

    // Final variable - unique identifier for the book, cannot be changed once set
    private final String isbn;

    private String title;
    private String author;

    // Constructor uses 'this' to initialize instance variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Getter method for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Display book details if the object is an instance of Book
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("--------------------------");
        } else {
            System.out.println("Invalid object - Not a Book instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Display library name (static)
        Book.displayLibraryName();

        // Create Book objects
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Show ISBN of book1
        System.out.println("Book 1 ISBN: " + book1.getIsbn());
    }
}

