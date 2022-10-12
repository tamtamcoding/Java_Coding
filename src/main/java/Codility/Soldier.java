package Codility;

import java.util.*;

public class Soldier {

    public static void main(String[] args) {
        int count = 0;
        int duplicates = 0;
        int[] S = new int[]{3, 4, 3, 0, 2, 2, 3, 0, 0};
        Arrays.sort(S);
        System.out.println(Arrays.toString(S));

        int previous = S[0] - 1;

        int dupCount = 0;

        for (int i = 0; i < S.length; i++) {
            if (S[i] == previous) {
                dupCount++;
            } else {
                previous = S[i];
            }
        }
        System.out.println("There were " + dupCount + " duplicates in the array.");
    }
}

//        for(int i = 0; i < S.length-1; i++){
//            if(S[i] == S[i+1]){
//                duplicates++;
//            }
//            System.out.println(count);
//        }

//        Arrays.sort(S);
//        System.out.println("\nThe sorted array is: ");
//        for (int num : S) {
//            System.out.print(num + " ");
//        }




//    public static int solution(int[] ranks) {
//
//    }

