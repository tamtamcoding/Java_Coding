package com.accenture.day4.abstraction.interfacedemo;
//child class
public class Admin implements Employee, SampleInterface{
    @Override
    public void detail() {
        System.out.println("ID: " + id + ", Name: " + name + ", Position: " +
                position + ", Gender: " +gender);
    }
}
