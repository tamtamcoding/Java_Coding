package udemyExercise.OOP.ClassesExercise.PoolArea;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
    }
    public double getVolume(){
        return getArea()*height;
    }

    public double getHeight() {
        return height;
    }
}
