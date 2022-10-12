package com.accenture.day4;

public class IntroToOOP {

    /*
    * OOP (Object Oriented Programming)
    * 1. flexible: code reuse: main concept of OOP
    * 2. provides structure
    *
    * Object has components:
    * 1. field/s - what the object is made out of -->name, color, height --> characteristic of an object
    * 2. method/s - what the object can do --> behavior of an object
    *
    * Concepts:
    * 1. Abstraction
    * 2. Encapsulation
    * 3. Inheritance
    * 4. Polymorphism
    * */

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "johnny";
        student.age = 35;
        student.studentDetails();


        Student student1 = new Student();
        student1.id = 2;
        student1.name = "angelina";
        student1.age = 44;
        student1.studentDetails();

    }
}
