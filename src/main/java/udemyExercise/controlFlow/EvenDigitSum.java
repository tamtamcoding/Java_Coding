package udemyExercise.controlFlow;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1231242353));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        int evenDigit = 0;
        if(number < 0){
            return -1;
        }
        while(number != 0){
            evenDigit = number % 10;
            if((evenDigit%2) == 0){
                sum = sum + evenDigit;
            }
            number = number / 10 ;
        }
        return sum;
    }
}
