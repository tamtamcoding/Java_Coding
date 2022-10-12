package com.accenture.day1.operators;

public class ArithmeticOperator {

    /*
    Arithmetic Operator - common mathematical operation
                : add +, subtraction -, multiplication *, division /, modulo % (reminder)

     Precedence:
     1. Parenthesis
     2. Multiplication, Division, Modulo
     3. Addition, Subtraction
     */

    public static void main(String[] args) {
        //<dataType> variableName = value;
        int myInt = 78;
        System.out.println("output: " + (myInt + 3));

        int sample = 3 * 18 / (3+3) - 2;
        System.out.println("sample output: " + sample);

        //shorthand sample
        int shorthand = 54;
        //shorthand = shorthand + 6;
        shorthand +=6;
        shorthand /=3;
        shorthand -=4;
        System.out.println("shorthand output: " + shorthand);

        //increment
        int inc = 32;
        //inc++ or ++inc
//        System.out.println("inc++ " + inc++);
//        System.out.println(inc);
        System.out.println("++inc : " + ++inc);
        System.out.println("++inc : " + ++inc);


        //decrement
        int dec = 78;
        System.out.println("--dec: " + --dec);
    }
}
