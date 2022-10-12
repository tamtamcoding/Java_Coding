package udemyExercise.OOP.ClassesExercise;

public class Main {
    public static void main(String[] args) {
//        SimpleCalculator calculate = new SimpleCalculator();
//        calculate.setFirstNumber(12);
//        calculate.setSecondNumber(24);
//        System.out.println(calculate.getAdditionResult());
//        System.out.println(calculate.getSubtractionResult());
//        System.out.println(calculate.getMultiplicationResult());
//        System.out.println(calculate.getDivisionResult());

        Person person  = new Person ();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(19);
        System.out.println(person.getAge());
        System.out.println(person.isTeen());

        person.getFullName();



    }
}
