package udemyExercise.controlFlow;

public class Lastdigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }
    public static int sumFirstAndLastDigit(int number){
        int reverse = 0;
        int stored = number;
        while ( stored != 0){
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored = stored / 10;
        }
        int lastDigit  = reverse % 10;
        int firstDigit = number % 10;
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
