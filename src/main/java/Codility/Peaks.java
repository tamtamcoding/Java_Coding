package Codility;

import java.util.ArrayList;
import java.util.List;

public class Peaks {
    public static void main(String[] args) {
        int S = solution(new int[] {1,2,3,4,3,4,1,2,3,4,6,2});
        System.out.println(S);
    }

    public static int solution(int[] A){
        List<Integer> istPeakIndex = new ArrayList<>();

        for(int i = 1; i < A.length; i++){
            if(A[i-1] < A[i] && A[i] > A[i + 1]){
                istPeakIndex.add(i);
            }
        }
        int N = A.length;

        for(int numBlocks = N; numBlocks >= 1; numBlocks--){
            if(N % numBlocks == 0){
                int blockSize = N/numBlocks;
                int blockOK = 0;

                for(int peakIndexList : istPeakIndex){
                if(peakIndexList/blockSize == blockOK){
                    blockOK++;
                }
                }
                if(blockOK == numBlocks){
                    return numBlocks;
                }
            }
        }
        return 0;
    }
}
