import java.util.*;

class ParkingArea {
    private final List<String> spots;

    ParkingArea(List<String> spots) {
        this.spots = new ArrayList<>(spots);
    }

    public List<String> getSpots() {
        return List.copyOf(spots);
    }
}

public class DefensiveCopyingDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P101");

        ParkingArea area = new ParkingArea(list);

        list.add("P102");

        System.out.println(area.getSpots());
    }
}