package com.accenture.day6.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    /*
    * Exception - possible error/s that we encounter and need to address
    *
    * */

    public static void main(String[] args) {
//        try {
//            int[] intArray = null;
//            System.out.println(intArray[15]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index Out of Bound Exception: " + e.getMessage());
//        } catch (NullPointerException e){
//            System.out.println("Null Pointer Exception: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int firstNum = scanner.nextInt();
            System.out.print("Enter second number: ");
            int secondNum = scanner.nextInt();
            System.out.println("Answer: "+ (firstNum/secondNum));
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Input Mismatch Exception: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }


    }
}
