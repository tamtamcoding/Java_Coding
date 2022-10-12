package pair.programming.day3;

import java.util.Scanner;

public class methodInJavaExercise {
    public static int getOddValue(int[] array) {
        int oddCounter = 0;
        for(int i=0;i< array.length;i++)
            if(array[i]%2 != 0){
                oddCounter++;
            }
       return oddCounter;
    }
    public static void displayOddValues(int[] array){
        System.out.println("odd number counted : " + getOddValue(array));
        for(int i=0;i< array.length;i++)
            if(array[i]%2 != 0){
                System.out.print(array[i]+", ");
            }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

        for (int i =0 ; i< array.length;i++){
            System.out.println("please input " +(i+1)+" number : ");
            array[i] = scan.nextInt();
        }
        displayOddValues(array);
    }
}
