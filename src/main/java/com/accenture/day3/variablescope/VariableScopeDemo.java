package com.accenture.day3.variablescope;

public class VariableScopeDemo {

    /*
    * Variable Scope - limitation that you need to set for a specific variable
    * 1. Local Variable
    * 2. Global Variable
    * */

    String localVariable = "This is an example of a local variable"; // --> default access modifiers

    static String globalVariable = "This is an example of a global variable"; //--> default access modifiers

    public static void main(String[] args) {
        VariableScopeDemo vs = new VariableScopeDemo();
//        System.out.println(vs.localVariable);
//
//        System.out.println(globalVariable);
        vs.randomMethod1();
        randomMethod2();
    }
    //non-static method
    protected void randomMethod1(){
        System.out.println(localVariable);
        System.out.println(globalVariable);
    }
    //static method
    protected static void randomMethod2(){
        VariableScopeDemo variableScopeDemo = new VariableScopeDemo();
        System.out.println(variableScopeDemo.localVariable);
        System.out.println(globalVariable);
    }
}
