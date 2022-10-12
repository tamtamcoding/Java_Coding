package Codility;

import java.util.Arrays;

public class Testing {

    public static int findNextGreaterElements(int[] input) {
        // base case
        int counter = 0;
        Arrays.sort(input);
        if (input == null) {
            return 0;
        }

        // do for each element
        int next = 0;
        for (int i = 0; i < input.length; i++) {
            // keep track of the next greater element for element `input[i]`
            next = -1;

            // process elements on the right of element `input[i]`
            for (int j = i + 1; j < input.length; j++) {
                // break the inner loop at the first larger element on the
                // right of element `input[i]`
                if (input[j] == input[i]) {

                    counter++;
                }
                else{
                    next = input[j];
                }
            }


        }
        return counter;
    }

    public static void main(String[] args)
    {
        int[] input = { 4, 4, 3, 3, 1, 0 };
        System.out.println(findNextGreaterElements(input));
        System.out.printf("id = %08.2f%n", 423.147);
//        float f = 3.14;
    }
}

