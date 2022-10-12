package udemyExercise.controlFlow;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 19));
    }
    public static boolean hasSameLastDigit( int x, int y, int z){
        int lastDigitx = x % 10;
        int lastDigity = y % 10;
        int lastDigitz = z % 10;

        if((x < 10 || y < 10 ||  z < 10) || (x > 1000 || y > 1000 || z > 1000)){
            return false;
        }else if((lastDigitx == lastDigity) || (lastDigitz == lastDigitx) || (lastDigity == lastDigitz)) {
            return true;
        }
        return false;
    }
}
