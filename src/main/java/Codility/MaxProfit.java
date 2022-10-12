package Codility;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{23171, 21011, 21123, 21366,21013, 21367}));
    }
    public static int solution(int[] A){
        if(A.length <= 1){
            return 0;
        }

        int minValue = A[0];
        int sum = 0;

        for(int i = 1 ; i < A.length; i++){
            if(A[i] < minValue){
                minValue = A[i];
            }else{
                int currentProfit = A[i] - minValue;
                if(currentProfit > sum){
                    sum = currentProfit;
                }

            }

        }
        return sum;
    }
}
