package com.accenture.day4.abstraction;
//parent class & abstract class
public abstract class Animal {

    //fields
    private String name;
    private int age;

    //methods
    //you cannot implement anything in the method body in an abstract method
    public abstract void details();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
