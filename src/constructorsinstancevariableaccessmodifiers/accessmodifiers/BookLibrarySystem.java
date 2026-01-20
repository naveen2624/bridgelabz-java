package constructorsinstancevariableaccessmodifiers.accessmodifiers;

// Base class
class Book {

    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter method to modify author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method to access author
    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends Book {

    String format;

    // Constructor
    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    // Method demonstrating access modifiers
    void displayEBookDetails() {
        System.out.println("ISBN   : " + ISBN);        // public access
        System.out.println("Title  : " + title);       // protected access
        System.out.println("Author : " + getAuthor()); // private via getter
        System.out.println("Format : " + format);
    }
}

// Main class
public class BookLibrarySystem {

    public static void main(String[] args) {

        // Creating EBook object
        EBook ebook = new EBook(
                "978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                "PDF"
        );

        // Display details
        ebook.displayEBookDetails();

        // Modify author using setter
        ebook.setAuthor("J. Bloch");

        System.out.println("\nAfter Author Update:");
        ebook.displayEBookDetails();
    }
}
