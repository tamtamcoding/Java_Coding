package Codility;

public class CountFactors {
    public static void main(String[] args) {
        System.out.println(solution(26));
    }
    public static int solution(int N){
        int sqrtN = (int) (Math.sqrt(N));
        int numFactors = 0;

        for(int i = 1; i <= sqrtN; i++){
            if(N % i == 0){
                numFactors++;
            }
        }
        numFactors = numFactors * 2;

        if(sqrtN*sqrtN == N){
            numFactors = numFactors -1 ;

        }
        return numFactors;
    }
}
