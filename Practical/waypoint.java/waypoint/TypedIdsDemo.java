record CustomerId(int value) {}
record BookingId(int value) {}

public class TypedIdsDemo {

    static void cancelBooking(BookingId bookingId) {
        System.out.println("Booking Cancelled");
    }

    public static void main(String[] args) {

        CustomerId customerId = new CustomerId(101);
        BookingId bookingId = new BookingId(201);

        cancelBooking(bookingId);

        // cancelBooking(customerId); // Compilation Error
    }
}