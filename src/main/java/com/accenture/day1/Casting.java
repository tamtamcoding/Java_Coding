package com.accenture.day1;

public class Casting {

    //Casting - converting an integer type number to another integer type number

    public static void main(String[] args) {
        //implicit casting - converting a lower bit number into a higher bit
        int myInt = 5685;
        long myLong = myInt;

        //explicit casting - converting a higher bit number into a lower bit
        long num = 132;
        byte myByte = (byte) num;
        System.out.println("myByte value: " + myByte);
        //<-127 to 0 to 128>>
    }
}
