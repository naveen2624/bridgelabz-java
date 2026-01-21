package linkedlist;

class LibrarySystem {

    static class Book {
        String title, author;
        int id;
        boolean available;
        Book prev, next;

        Book(int id, String t, String a) {
            this.id = id;
            title = t;
            author = a;
            available = true;
        }
    }

    Book head, tail;

    void addEnd(int id, String t, String a) {
        Book b = new Book(id, t, a);
        if (head == null) {
            head = tail = b;
            return;
        }
        tail.next = b;
        b.prev = tail;
        tail = b;
    }

    void display() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.author);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem();
        lib.addEnd(1, "Java", "James");
        lib.addEnd(2, "Python", "Guido");
        lib.display();
    }
}
