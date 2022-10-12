package Codility;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    public static void main(String[] args) {
        int S = solution(new int[]{-5,-3,-2,0,3,6,-6,1,10});
        System.out.println(S);
    }
    public static int solution(int[] A){
        Set<Integer> set = new HashSet<>();

        for (int j : A) {
            set.add(Math.abs(j));
        }
        return set.size();

    }



}
