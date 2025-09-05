package Constructor.level1;

// Book class
public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------");
    }
}

// Test class
class BookTest {
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.displayBookDetails();

        // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.99);
        b2.displayBookDetails();
    }
}
