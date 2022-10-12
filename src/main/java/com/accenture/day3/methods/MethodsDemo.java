package com.accenture.day3.methods;

import com.accenture.day3.variablescope.VariableScopeDemo;

public class MethodsDemo {

    /*
    * Method - is a function that deals with a specific task/s
    *   - function that you call when needed
    *
    * <accessModifier> <static/non-static> <returnType/void> variableName(parameterized/non-parameterized){
    *       //method body
    * <<return type>> --> data type
    *   note return type -> used "return" keyword
    * }
    * */

    public static void main(String[] args) {
        System.out.println(welcomeMessage1());

        MethodsDemo demo = new MethodsDemo();
        System.out.println(demo.welcomeMessage2());


        VariableScopeDemo variableScopeDemo = new VariableScopeDemo();
        //error because of access modifiers  of the methods
//        variableScopeDemo.randomMethod1();
//        variableScopeDemo.randomMethod2();
    }

    public static String welcomeMessage1(){
        return "Welcome to Bootcamp July 2022.";
    }

    public String welcomeMessage2(){
        return "Welcome to Java Training.";
    }
}
