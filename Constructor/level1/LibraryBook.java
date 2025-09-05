package Constructor.level1;

// LibraryBook class
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("✅ Book borrowed: " + title);
        } else {
            System.out.println("❌ Book not available: " + title);
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + available);
        System.out.println("---------------------------");
    }
}

// Test class
class LibraryTest {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Programming", "James Gosling", 499.99, true);

        b1.displayBookDetails();  // show details
        b1.borrowBook();          // borrow first time
        b1.displayBookDetails();  // show after borrowing
        b1.borrowBook();          // try borrowing again
    }
}
