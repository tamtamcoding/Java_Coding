package udemyExercise.OOP.ClassesExercise.Polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
    public String startEngine(){
        return getClass().getSimpleName() + " -> start engine";
    }
    public String accelerate(){
        return getClass().getSimpleName() + "-> accelerating";
    }
    public String brake(){
        return getClass().getSimpleName() + "-> braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
