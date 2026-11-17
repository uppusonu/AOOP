class ParkingSpot {
    private String vehicleNumber;

    public void parkVehicle(String number) {
        if (vehicleNumber != null) {
            throw new IllegalStateException("Spot Occupied");
        }
        vehicleNumber = number;
    }

    public void releaseSpot() {
        if (vehicleNumber == null) {
            throw new IllegalStateException("Spot Already Free");
        }
        vehicleNumber = null;
    }

    public boolean isAvailable() {
        return vehicleNumber == null;
    }
}

public class IllegalStateDemo {
    public static void main(String[] args) {

        ParkingSpot spot = new ParkingSpot();

        spot.parkVehicle("TS09AB1234");

        System.out.println("Available: " + spot.isAvailable());

        spot.releaseSpot();

        System.out.println("Available: " + spot.isAvailable());
    }
}