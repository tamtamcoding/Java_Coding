package udemyExercise.Arrays.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static Scanner scanner = new Scanner(System.in);
    private static int readinteger(){
        System.out.println("length of arrays");
        return scanner.nextInt();
    }
    private static int[] readElements(int number){
        int[] array = new int[number];
        for(int i = 0; i < number; i++){
            System.out.println("Enter number " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] sortInteger(int[] myArray){
        int[] sortedArray = Arrays.copyOf(myArray, myArray.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            System.out.println("im here");
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    System.out.println("hello");
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] =temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int num = readinteger();
        int[] arr = readElements(num);
        System.out.println(Arrays.toString(sortInteger(arr)));
    }
}
