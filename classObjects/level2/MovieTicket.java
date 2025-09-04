package classObjects.level2;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie : " + movieName);
        System.out.println("Seat  : " + seatNumber);
        System.out.println("Price : " + price);
    }
}
