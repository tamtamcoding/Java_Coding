package com.accenture.day6.exceptions.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionImpl {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: " );
        String name = scanner.nextLine();
            try {
                if (name.isEmpty()){
                    throw new CustomException(CustomException.EMPTY_NAME);
                } else if (!(name.equalsIgnoreCase("java"))) {
                    throw new CustomException(CustomException.INCORRECT_NAME);
                } else {
                    System.out.println("The name entered is correct. You can now proceed.");
                }
            }  catch (CustomException e){
                System.out.println("Exception: " + e.getMessage());
            }

    }
}
