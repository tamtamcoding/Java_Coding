package com.accenture.day4.inheritance;
//parent class
public class Person {

    //fields
    private String name, work;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //methods
    public void sleep(){
        System.out.println(getName() + " is sleeping.");
    }

    public void eat(){
        System.out.println(getName() + " is eating.");
    }
}
