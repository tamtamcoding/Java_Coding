package com.accenture.day7.codility;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CodilityDemo {

    public static void main(String[] args) {
        CodilityDemo codilityDemo = new CodilityDemo();
        int[] input = {-1,-3};
        System.out.println("Smallest Positive Integer: " +codilityDemo.solution(input));
    }

    public int solution(int[] A) {
       //if only one element in array
        if (A.length == 1){//basic check
            if (A[0] <= 0){//check for negative numbers
                return 1;
            }
            if (A[0] == 1){
                return 2;
            } else {
                return A[0] - 1;
            }
        }

        //removing negative number and duplicate value
        Set<Integer> filter = Arrays.stream(A).boxed().filter(e -> e > 0).
                collect(Collectors.toCollection(HashSet::new));

        //find the smallest positive integer
        int missingNumber = 1;
        for (Integer i : filter){
            if(!filter.contains(missingNumber)){
                return missingNumber;
            }
            missingNumber++;
        }
        return missingNumber;

    }
}
