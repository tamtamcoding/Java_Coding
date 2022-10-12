package udemyExercise.OOP.ClassesExercise.PoolArea;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.width = (width<0) ? 0 : width;
        this.length = (length<0) ? 0 : length;
    }

    public double getArea(){
        return length*width;
    }

    //getter

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
