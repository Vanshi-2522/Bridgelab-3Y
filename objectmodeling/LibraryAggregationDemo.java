package objectmodeling;



import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book b : books) {
            b.displayBook();
        }
        System.out.println("--------------------------------");
    }
}

public class LibraryAggregationDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library centralLibrary = new Library("Central Library");
        Library cityLibrary = new Library("City Library");

        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        cityLibrary.addBook(book2);
        cityLibrary.addBook(book3);

        centralLibrary.displayBooks();
        cityLibrary.displayBooks();
    }
}


