package Codility;

public class TieRopes {
    public static void main(String[] args) {
        int answer = Solution(4, new int[]{1, 2, 3, 4, 1, 1, 3});
        System.out.println(answer);
    }
    public static int Solution(int K, int[] A){
        int total = 0;
        int currentLength = 0;
        for (int i = 0; i < A.length; i++){
            currentLength = currentLength + A[i];
            if(currentLength >= K){
                total++;
                currentLength = 0;
        }

        }

        return total;
    }
}
