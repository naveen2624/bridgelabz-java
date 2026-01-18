package classandobject.level2;

public class MovieTicket {

    // Ticket attributes
    String movieName;
    int seatNumber;
    double price;

    /*
     * Method to book ticket
     */
    public void bookTicket(String movie, int seat, double ticketPrice) {

        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;

        System.out.println("Ticket Booked Successfully!");
    }

    /*
     * Method to display ticket details
     */
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Inception", 25, 180);
        ticket.displayTicketDetails();
    }
}
