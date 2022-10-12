package com.accenture.day1.operators;

public class RelationalOperator {

    /*
    Relational Operator : returns boolean value but uses actual data
    >, <, =<, =<, ==, !=
     */

    public static void main(String[] args) {
        int userValue = 123456789;
        int finalValue = 987654321;

//        System.out.println("value: " + (userValue <= finalValue));

        if (finalValue != 987654321){
            System.out.println("The two values compared are not equal");
        } else {
            System.out.println("The two values compared are equal");
        }


        String name = "java";
        System.out.println("bootcamp" == name);

    }
}
