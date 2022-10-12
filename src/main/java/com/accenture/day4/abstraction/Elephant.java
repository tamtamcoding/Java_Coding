package com.accenture.day4.abstraction;
//child class
public class Elephant extends Animal{
    @Override
    public void details() {
        System.out.println("The name of the elephant is " + getName());
        System.out.println("This is from the Elephant Class.");
    }
}
