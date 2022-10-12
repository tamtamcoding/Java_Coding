package Codility;

public class CountDistinctSlices {

    public static void main(String[] args) {
        int S = solution(6, new int[]{3,4,5,5,2});
        System.out.println(S);
    }
        //caterpillar method
    /*

     */
    public static int solution(int M , int[] A){
        boolean [] seen = new boolean[M + 1];
        int numberSlices = 0;
        int leftSide = 0;
        int rightSide = 0;

        while(leftSide < A.length && rightSide < A.length){
            if(!seen[A[rightSide]]){
                numberSlices = numberSlices + (rightSide - leftSide + 1);
                if (numberSlices >= 1_000_000_000){
                    return 1_000_000_000;
                }
                seen[A[rightSide]] = true;
                rightSide++;
            }
            else{
                seen[A[leftSide]] = false;
                leftSide++;
            }
        }
        return numberSlices;
    }
}
