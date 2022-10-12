package udemyExercise.OOP.ClassesExercise.Points;

import java.awt.*;

public class main {
    public static void main(String[] args) {

        Points pointer1 = new Points(6,5);
        Point pointer2 = new Point(3,1);

        System.out.println(pointer1.distance());
        System.out.println("distance(second)= " + pointer1.distance(pointer2));

    }
}
