package udemyExercise.OOP.ClassesExercise.CarpetCost;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length){
        this.width = width;
        this.length = length;

        if(length < 0){
            length = 0.0;
        }
        if(width < 0){
            width = 0.0;
        }
    }
    public double getArea(){
        return (this.length * this.width);
    }

}
