package com.accenture.day5.parsing;

public class ParsingDemo {

    //Parsing - converting a primitive data type into a String or vice versa

    public static void main(String[] args) {
        int x = 359684;
        String s = String.valueOf(x);

        System.out.println("359684" == s);

        String myString = "215454521548";
        long myLong = Long.parseLong(myString);
        System.out.println("value of long:" + (myLong+7));

        String value = "false";
        boolean myBoolean = Boolean.parseBoolean(value);
        System.out.println(myBoolean == false);
    }
}
