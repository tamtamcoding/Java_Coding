package com.accenture.day1;

public class DataTypes {

    /* Data Type - are the values that we store in a variable in which we can use in a project or an application
                - byte, long, short, int, boolean, char, double, float, String, Array
       8 Primitive Data Types - byte, long, short, int, boolean, char, double, float
       1. Integer Type - whole numbers
              byte : can hold 8 bit
              short : can hold 16 bit
              int : can hold 32 bit
              long : can hold 64 bit
       2. Floating Type - decimal numbers
               double : 8 byte, more precise because it can hold up to 15 decimal places
               float : 4 byte, 6 decimal places
       3. Non-numeric Type
               boolean : only holds true or false
               char : only stores a single character or symbol or number
                    : uses '' to create a variable

     Non-Primitive Data Types
     1. String : uses "" to create a variable
               : can store multiple number/s or sentence/s or symbol/s
     2. Array : can hold multiple value in a single variable
     */


    public static void main(String[] args) {
        //<dataType> variableName = value;
        byte myByte = 23;
        short myShort = 226;
        int myInt = 2688;
        long myLong = 54532268;

        double myDouble = 12.54546512241546325;
        System.out.println("myDouble value: " + (myDouble + 1));

        float myFloat = 12.54546512241546325f;
        System.out.println("myFloat value: " + myFloat);

        char myChar = '.';

        String welcomeMessage = "Welcome FY22.53 to Java Bootcamp! ";
        System.out.println(welcomeMessage + "Hope you learn a lot.");

    }
}
