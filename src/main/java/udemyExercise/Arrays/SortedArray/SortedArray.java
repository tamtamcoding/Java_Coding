package udemyExercise.Arrays.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] newarray = getIntegers(5);

        System.out.println(Arrays.toString(sortInteger(newarray)));
    }
    public static int[] getIntegers(int number){
        //parameter will initialise array length
        //create new array to set the length
        int[] myArray = new int[number];
        System.out.println("enter " + number + " integers");
        for(int i = 0; i < number; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static void printArray(int[] myArray) {
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }
    public static int[] sortInteger(int[] myArray){
        int[] sortedArray = Arrays.copyOf(myArray, myArray.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] =temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
