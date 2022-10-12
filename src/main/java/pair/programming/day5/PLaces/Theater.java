package pair.programming.day5.PLaces;

public class Theater extends Building{
    public Theater(String placeName, int capacity, String placeDescription, int workingHours) {
        super(placeName, capacity, placeDescription, workingHours);
    }

    @Override
    void showEvents() {
        System.out.println("Events ready to be hosted !!");
    }

    @Override
    void showArea() {
        System.out.println("Theater area : " + getCapacity()*12);
    }
}
