package pair.programming.day5.Vehicle;

public class Vehicle {
    private int doors;
    private int seats;
    private int wheels;

    public Vehicle(){
        System.out.println("Building a vehicle ...");
    }

    public Vehicle(int doors, int seats, int wheels) {
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
        System.out.println("Building a vehicle ...\nnumber of doors =" + doors + "\n" + "number of seats = " + seats +
                "\n" + "number of wheels = " + wheels);
    }
    public void drive(){
        System.out.println("Driving a vehicle ...\n number of doors =" + doors + "\n" + "number of seats = " + seats +
        "\n" + "number of wheels = " + wheels);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
