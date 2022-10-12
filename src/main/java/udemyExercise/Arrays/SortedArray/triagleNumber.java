package udemyExercise.Arrays.SortedArray;

import java.util.Arrays;

public class triagleNumber {
    public static void main(String[] args) {
        long rows = 74088, number = 1;
        long sum = 0;
        System.out.println(rows*rows*rows);

        for(int i = 1; i <= rows; i++) {
            sum = 0;
            for(int j = 1; j <= i; j++) {
                sum = sum + number;
//                System.out.print(number + " ");
                number+=2;
            }

//            System.out.println();

//            System.out.println(sum);
        }
    }
    }

