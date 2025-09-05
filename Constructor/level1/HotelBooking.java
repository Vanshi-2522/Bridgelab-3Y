package Constructor.level1;

// HotelBooking class
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("---------------------------");
    }
}

// Test
class HotelBookingTest {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking(); // default
        HotelBooking b2 = new HotelBooking("Alice", "Deluxe", 3); // parameterized
        HotelBooking b3 = new HotelBooking(b2); // copy constructor

        b1.displayBooking();
        b2.displayBooking();
        b3.displayBooking();
    }
}

