package pair.programming.day5.PLaces;

public abstract class Building extends Place{

    public Building(String placeName, int capacity, String placeDescription, int workingHours) {
        super(placeName, capacity, placeDescription, workingHours);
    }
    abstract void showArea();
}
