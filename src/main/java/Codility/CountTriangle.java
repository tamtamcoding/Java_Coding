package Codility;

import java.util.Arrays;

public class CountTriangle {
    public static void main(String[] args) {
        int triangleCount = solution(new int[]{10,2,5,1,8,12});
        System.out.println(triangleCount);
    }
    public static int solution(int[] A){
        int numTriangle = 0;
        Arrays.sort(A);
        for(int i = 0; i < A.length -2 ; i++){
            int right = i + 2;
            int left = i + 1;
            while ( left < A.length -1 ){
                if(right < A.length && A[i] + A[left] > A[right]){
                    right++;
                }
                else{
                    numTriangle = numTriangle + (right - left -1);
                    left++;
                }

            }
        }
        return numTriangle;
    }
}
