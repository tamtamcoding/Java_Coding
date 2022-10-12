package udemyExercise.controlFlow;


public class numberPalidrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int stored = number;
        while ( stored != 0){
        int digit = stored % 10;
        reverse = (reverse * 10) + digit;
        stored = stored / 10;
        }
        if(number == reverse){
            return true;

        }else{
            return false;
        }
    }
}
