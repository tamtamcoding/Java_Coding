package Codility;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        int [] A = {1, 3, 2, 1};
        int [] B = {4, 2, 5, 3, 2};
        System.out.println(solution(new int[]{1, 3, 2, 1},new int[]{4, 2, 5, 3, 2}));

    }

    public static int solution(int[] A, int[] B){
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        int i = 0;
        for (int k = 0; k < n;k++) {
            if (A[k] == B[i]) {
                return A[k];
            }
            if (i < m - 1 && B[i] < A[k])
                i ++;

        }
        return -1;
    }
}
