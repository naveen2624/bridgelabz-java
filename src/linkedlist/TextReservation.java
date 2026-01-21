package linkedlist;

class TicketReservation {

    static class Ticket {
        int id;
        String customer, movie, seat, time;
        Ticket next;

        Ticket(int id, String c, String m, String s, String t) {
            this.id = id;
            customer = c;
            movie = m;
            seat = s;
            time = t;
        }
    }

    Ticket head = null, tail = null;

    void addTicket(int id, String c, String m, String s, String t) {
        Ticket tk = new Ticket(id, c, m, s, t);
        if (head == null) {
            head = tail = tk;
            tk.next = head;
        } else {
            tail.next = tk;
            tail = tk;
            tail.next = head;
        }
    }

    void removeTicket(int id) {
        if (head == null) return;
        Ticket curr = head, prev = tail;

        do {
            if (curr.id == id) {
                if (curr == head) head = head.next;
                if (curr == tail) tail = prev;
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.id + " | " + temp.customer + " | " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservation tr = new TicketReservation();
        tr.addTicket(1, "Naveen", "Inception", "A1", "10:00 AM");
        tr.addTicket(2, "Rahul", "Interstellar", "B2", "1:00 PM");

        tr.displayTickets();
        System.out.println("Total Tickets: " + tr.countTickets());
    }
}
