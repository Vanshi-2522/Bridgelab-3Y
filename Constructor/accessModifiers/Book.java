package Constructor.accessModifiers;

// Parent class: Book
public class Book {
    public String ISBN;          // Public: accessible anywhere
    protected String title;      // Protected: accessible in subclass
    private String author;       // Private: accessible only inside this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter & Setter for private variable "author"
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book info
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to demonstrate access
    public void displayEBookInfo() {
        // Access public member
        System.out.println("ISBN: " + ISBN);   // ✅ allowed (public)

        // Access protected member
        System.out.println("Title: " + title); // ✅ allowed (protected, subclass can access)

        // Access private member (not allowed directly!)
        // System.out.println(author); ❌ error
        System.out.println("Author (via getter): " + getAuthor());

        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

// Test class
class LibraryTest {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-1234567890", "Java Programming", "James Gosling", 5.5);

        // Display using parent class method
        System.out.println("📚 Book Info (Parent):");
        ebook.displayBookInfo();

        System.out.println("\n💻 EBook Info (Child):");
        ebook.displayEBookInfo();

        // Modifying private author using setter
        ebook.setAuthor("Updated Author");

        System.out.println("\nAfter updating author:");
        ebook.displayBookInfo();
    }
}
