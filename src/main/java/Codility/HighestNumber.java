package Codility;

import java.util.ArrayList;
import java.util.*;

public class HighestNumber {
    public static void main(String[] args) {
        int arr[] = {4, 4, 3, 3, 1, 0 };
        System.out.println(arr.length-1);
        // Initialize maximum elemen

        System.out.println(highest(arr));
        System.out.println(solution(arr));
    }
    public static int solution(int[] ranks) {
        Arrays.sort(ranks);
        int counter = 0;
        int length = 0;
        int occurance = 0;
        for(int i = 0; i< ranks.length; i++){
            if(ranks[i] == highest(ranks)){
                occurance++;

            }
        }
        System.out.println(occurance);
        length = occurance;

        if (ranks == null) {
            return 0;
        }
        int next = 0;
        for (int i = 0; i < ranks.length; i++) {
            next = -1;
            for (int j = i + 1; j < ranks.length; j++) {
                if (ranks[j] == ranks[i]){                          counter++;
                    break;
                }
                else{
                    next = ranks[i];
                }
            }
        }
        return counter;
    }
    public static int highest(int[] ranks){
        int max = ranks[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < ranks.length; i++) {
            if (ranks[i] > max)
                max = ranks[i];
        }
        return max;
    }
}
