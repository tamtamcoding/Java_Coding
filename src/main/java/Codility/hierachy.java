package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//    public int solution(int[] ranks) {
//        // write your code in Java SE 8
//        int result = 0;
//        List<Integer> newRanks = new ArrayList<>();
//        for(int i = 0; i < ranks.length ; i++){
//            newRanks.add(i);
//        }
//
//        for (int i = 0; i < newRanks.size(); i++) {
//            int temp = newRanks.get(i);
//            if (newRanks.get(v ->(v) == temp + 1)) {
//                result++;
//            }
//        }
//        return result;
//    }



public class hierachy {
    public static void main(String[] args) {
        int count = 0;
        int temp = 0;
        int[] S = new int[]{3, 4, 3, 0, 2, 2, 3, 2, 1};
        Arrays.sort(S);
//        int previous = -1;
//        System.out.println(Arrays.toString(S));
//        for(int i =0; i < S.length; i++){
//            if(S[i] == previous+1){
//                count++;
//            }else{
//                previous = S[i];
//            }
//        }
//        System.out.println(count);
        boolean condition = true;
        while(condition){
            for(int i = 0; i < S.length; i++){
                if(S[i] == (S[temp] + 1)){
                    count++;
                    condition = true;
                }else{
                    temp = i+1;
                    condition = false;
                }
            }
        }
        System.out.println(count);
    }
}