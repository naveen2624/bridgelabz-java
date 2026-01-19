package constructorsinstancevariableaccessmodifiers.constructors;

public class BookBorrow {
        String title;
        String author;
        double price;
        boolean available;

        BookBorrow(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = true;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("Book borrowed successfully.");
            } else {
                System.out.println("Book is not available.");
            }
        }

        void display() {
            System.out.println(title + " | " + author + " | Available: " + available);
        }

        public static void main(String[] args) {
            BookBorrow b = new BookBorrow("Java Basics", "James Gosling", 450);
            b.display();
            b.borrowBook();
            b.borrowBook();
        }

}
