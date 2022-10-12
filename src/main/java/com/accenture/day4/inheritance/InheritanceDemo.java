package com.accenture.day4.inheritance;

public class InheritanceDemo {

    /*
    * Inheritance - reusing the methods from a parent class
    *  "inherits" - parents to child
    * - it has an "IS-A" relationship
    * - you can only inherit from ONE parent
    * */

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("paul");
        programmer.sleep();


        Dancer dancer = new Dancer();
        dancer.setName("beyonce");
        dancer.sleep();
    }

}
