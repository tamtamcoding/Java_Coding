package com.accenture.day4.polymorphism.methodoverloading;

public class MethodOverloadingDemo {

    /*
    * Method Overloading - reusing variable name for a method
    * 1. different return type
    * 2. different method parameters
    * */
    public static void main(String[] args) {
        System.out.println("Cube: " + volume(5));
        System.out.println("Rectangular Prism: " + volume(4,5,6));
        System.out.println("Pyramid: " + volume(4.0,5,6));
    }


    //volume of a cube
    public static int volume(int a){
        return a*a*a;
    }

    //volume of a rectangular prism
    public static int volume(int l, int w, int h){
        return l*w*h;
    }

    //volume of a pyramid
    public static double volume(double l, int w, int h){
        return (l*w*h)/3;
    }



}
