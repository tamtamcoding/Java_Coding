package udemyExercise.controlFlow;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(44,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int counterDigit = 0;
        int counterDigit2 = 0;
        if(first < 10 || second  < 10){
            return -1;
        }
        for(int i = 1 ; i < first ; i ++){
            if((first % i) == 0){
                counterDigit = i;
                System.out.println(counterDigit);
            }

        }
        for(int i = 1 ; i < second ; i ++){
            if((first % i) == 0){
                counterDigit2 = i;
                System.out.println(counterDigit2);

            }

        }
       return 1;
    }

}
