package Codility;

public class MinMaxDivision {
    public static void main(String[] args) {
        int S = solution(3, 5,new int[]{2,1,5,1,2,2,2});
        System.out.println(S);
    }

    public static int solution(int K, int M, int[] A){
        int maxSum = 0;
        int minSum = 0;
        for(int i = 0 ; i < A.length ; i++){
            maxSum = maxSum + i;
            minSum = Math.max(minSum, A[i]);
        }
        int answer = maxSum;

        while(minSum <= maxSum){
            int midSum = (minSum + maxSum)/2;

            boolean ok = checkDivisable(midSum, K, A);

            if(ok){
                answer = midSum;
                maxSum = midSum -1;
            }
            else{
                minSum =midSum + 1;
            }
        }
        return answer;
    }
    public static boolean checkDivisable(int mid, int k, int[] a){
        int allowedBlock = k;
        int currentBlock = 0;

        for (int j : a) {
            currentBlock = currentBlock + j;
            if (currentBlock > mid) {
                allowedBlock--;
                currentBlock = j;
            }
            if (allowedBlock == 0) {
                return false;
            }
        }
        return true;
    }
}
