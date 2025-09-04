package classObjects.level2;

public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");

        ticket.bookTicket(12, 250.0);
        ticket.displayDetails();
    }
}
