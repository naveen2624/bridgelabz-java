package thisstaticfinalkeywords;
class Library {

    static String libraryName = "Central Library";

    final String isbn;
    String title;
    String author;

    Library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Library) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
    public static void main(String[] args) {
        Library b1 = new Library("Java Basics", "James", "ISBN123");
        Library.displayLibraryName();
        b1.displayDetails(b1);
    }
}

