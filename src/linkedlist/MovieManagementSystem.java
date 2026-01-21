package linkedlist;

class MovieManagementSystem {

    static class Movie {
        String title, director;
        int year;
        double rating;
        Movie prev, next;

        Movie(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    Movie head, tail;

    void addEnd(String t, String d, int y, double r) {
        Movie m = new Movie(t, d, y, r);
        if (head == null) {
            head = tail = m;
            return;
        }
        tail.next = m;
        m.prev = tail;
        tail = m;
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                System.out.println("Movie removed");
                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println(temp.title + " - " + temp.rating);
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem m = new MovieManagementSystem();
        m.addEnd("Interstellar", "Nolan", 2014, 9.0);
        m.addEnd("Inception", "Nolan", 2010, 8.8);
        m.displayForward();
        m.updateRating("Inception", 9.2);
        m.displayReverse();
    }
}
