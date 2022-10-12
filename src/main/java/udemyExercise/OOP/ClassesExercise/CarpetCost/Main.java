package udemyExercise.OOP.ClassesExercise.CarpetCost;

public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor(2.75, 4);
        Carpet carpet1 = new Carpet(-1);
        Calculator calculate = new Calculator(floor1,carpet1);
        calculate.getTotalCost();
        System.out.println(calculate.getTotalCost());
    }
}
