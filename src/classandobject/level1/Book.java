package classandobject.level1;

public class Book {
    String title;
    String author;
    double price;
    public void displayDetailsOfBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args){
        Book b = new Book();
        b.title= "Harry Potter";
        b.author="J K Rowling";
        b.price=2399.60;
        b.displayDetailsOfBook();
    }
}
