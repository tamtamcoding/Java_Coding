package pair.programming.day5.PLaces;

public abstract class Place {
    private String placeName;
    private int capacity;
    private String placeDescription;
    private int workingHours;

    public Place(String placeName, int capacity, String placeDescription, int workingHours) {
        this.placeName = placeName;
        this.capacity = capacity;
        this.placeDescription = placeDescription;
        this.workingHours = workingHours;
    }
    abstract void showEvents();

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
