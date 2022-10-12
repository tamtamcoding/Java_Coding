package udemyExercise.controlFlow;

import java.util.Scanner;

public class sumDigit {
    public void getSum(){
        int sum = 0;
        int digit = 0;
        int number = 0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if(number < 10 || number == 1 ){
            System.out.println("-1");
        }
        while(number >= 10){
            digit = number%10;
            sum = sum + digit;
            number = number / 10 ;
        }
        System.out.println(" the sum of digit number " + sum);
    }


}
