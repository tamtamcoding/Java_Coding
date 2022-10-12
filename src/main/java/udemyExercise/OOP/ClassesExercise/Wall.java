package udemyExercise.OOP.ClassesExercise;

public class Wall {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width < 0){
            this.width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
        this.height = height;
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Wall(){
        System.out.println("no parameter constructor called");
    }
    public double getArea(){
        return width * height;
    }
}
