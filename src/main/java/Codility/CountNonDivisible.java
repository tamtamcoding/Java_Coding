package Codility;

import java.util.Arrays;
import java.util.HashMap;

public class CountNonDivisible {
    public static void main(String[] args) {
        int[] arrayResults = solution(new int[]{3,1,2,3,6});
        System.out.println(Arrays.toString(arrayResults));
    }
    public static int[] solution(int[] A) {

        // main idea:
        // using "HashMap" to count

        // map1(key, value)
        HashMap<Integer, Integer> map1 = new HashMap<>();
        // key: the elements, value, count of elements
        for (int j : A) {
            if (!map1.containsKey(j)) {
                map1.put(j, 1); // add new element
            } else {
                map1.put(j, map1.get(j) + 1); // count++
            }
        }

        // map2(key, value)
        HashMap<Integer, Integer> map2 = new HashMap<>();
        // key: the elements, value, count of "number of non-divisors" of elements
        for( int n : map1.keySet() ){
            int numDivisors =0;
            // find divisors from 1 to sqrt(n)
            int sqrtN = (int)Math.sqrt(n);
            for(int i=1; i<=sqrtN; i++ ){
                if( n % i == 0){ // means: i could be a divisor
                    int anotherDivisor = n/i;

                    if(map1.containsKey(i)){
                        numDivisors = numDivisors + map1.get(i);
                    }
                    if(anotherDivisor != i){ // avoid double count (be careful)
                        if(map1.containsKey(anotherDivisor)){
                            numDivisors = numDivisors + map1.get(anotherDivisor);
                        }
                    }
                }
            }

            int numNonDivisors = A.length - numDivisors;
            map2.put(n, numNonDivisors);
        }

        // results: number of non-divisors
        int[] results = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            results[i] = map2.get(A[i]);
        }

        return results;
    }

//    public static int[] solution(int[] A){
//        HashMap<Integer, Integer> map1 = new HashMap<>();
//        for(int i = 0; i < A.length; i++){
//            if(map1.containsKey(A[i]) == false){
//                map1.put(A[i], 1);
//            }
//            else{
//                map1.put(A[i],map1.get(A[i])+1);
//            }
//        }
//        HashMap<Integer, Integer> map2 = new HashMap<>();
//        for(int n : map1.keySet()){
//            int numberDivisor = 0;
//            int sqrtN = (int) Math.sqrt(n);
//            for(int i = 1; i <=sqrtN; i++){
//                if(n % i == 0){
//                    int anotherDivisor = n/i;
//                    if(map1.containsKey(i) == true){
//                        numberDivisor = numberDivisor + map1.get(i);
//                    }
//                    if(anotherDivisor != i){
//                        if(map1.containsKey(anotherDivisor) == true){
//                            numberDivisor = numberDivisor + map1.get(anotherDivisor);
//                        }
//                    }
//                }
//            }
//            int notDivisor = A.length - numberDivisor;
//            map2.put(n, numberDivisor);
//        }
//        int[] results = new int[A.length];
//        for(int i = 0; i < results.length; i++){
//            results[i] = map2.get(A[i]);
//        }
//        return results;
//    }
}
