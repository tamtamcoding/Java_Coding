package com.accenture.day4.inheritance;
//child class
//Programmer IS A Person
public class Programmer extends Person{

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("FROM PROGRAMMER CLASS");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
