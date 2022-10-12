package Codility;

import java.util.*;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
    public static int solution(int N) {
        // write your code in Java SE 8

        int max_gap = 0;
        int current_gap =0;
        boolean counting = false;

        // Using the "concept of bit manipulation" and "& operation"

        while( N !=0 ){

            if(!counting){    // for the first "1"
                if( (N&1) == 1){      // note: cannot use n&1 without "()"
                    counting = true;  // start to count
                }
            }
            else{                    // counting = true
                if( (N&1) ==0){      // note: cannot use n&1 without "()"
                    current_gap ++;
                }
                else{ // N & 1 == 1
                    max_gap = Math.max(max_gap, current_gap);
                    current_gap = 0; // reset
                }
            }

            N = N >> 1; // shift by one (right side)
            // note: cannot just write "N >> 1"
        }

        return max_gap;
    }
//public static int solution(int N) {
//    String binaryString = Integer.toBinaryString(N);
//
//    int longestBinaryGap = 0;
//    List onesList = new ArrayList();
//
//    for(int i=0; i<binaryString.length(); i++) {
//        if(binaryString.charAt(i) == '0') continue;
//        onesList.add(i);
//    }
//
//    for(int i=0; i<onesList.size() - 1; i++) {
//        //subtract 1 so that don't count 1's next to each other as having any gap
//        int diff = (int) (onesList.get(i+1));
//        int ori = (int) (onesList.get(i));
//        int indicesDiff = diff - ori -1;
//
//        longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
//    }
//    return longestBinaryGap;
//}
}
