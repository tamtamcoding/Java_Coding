package pair.programming.day5.Vehicle;

public class Cars extends Vehicle{
    public Cars(){
        System.out.println("Building a car...");
    }

    public Cars(int doors, int seats, int wheels) {
        System.out.println("Building a car ...\nnumber of doors =" + doors + "\n" + "number of seats = " + seats +
                "\n" + "number of wheels = " + wheels);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car ...");
    }
}
