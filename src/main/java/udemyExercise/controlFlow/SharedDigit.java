package udemyExercise.controlFlow;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }
    public static boolean hasSharedDigit ( int number1, int number2){
        int lastDigitN1 = number1%10;
        int lastDigitN2 = number2%10;
        int firstDigitN1 = number1/10;
        int firstDigitN2 = number2/10;
        if((number1 < 10 || number1>99) || (number2<10 || number2 > 99)){
            return false;
        }
        else if(lastDigitN1 == lastDigitN2 || firstDigitN1 ==firstDigitN2){
            return true;
        }else if(lastDigitN1 == firstDigitN2 || firstDigitN1 == lastDigitN2){
            return true;
        }
        return false;
    }
}
