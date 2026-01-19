package constructorsinstancevariableaccessmodifiers.constructors;

public class Book {
    String title;
    String author;
    double price;
    // Default constructor
    public Book(){
        title="Default";
        author="Default";
        price=0.0;
    }
    // Parameterized constructor
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // Method to display book details
    public void displayDetails(){
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
    // Main method to test the class
    public static void main(String[] args){
        Book b1=new Book();
        Book b2=new Book("Harry Potter","J K Rowling",1499.99);
        System.out.println("Book 1 Details:");
        b1.displayDetails();

        System.out.println("\nBook 2 Details:");
        b2.displayDetails();

    }
}
