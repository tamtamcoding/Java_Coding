package com.accenture.day4.encapsulation;

public class Dog {

    //fields (set your fields private)
    private String name, color, gender;
    private int age;

    public Dog() {
        //empty constructor
    }

    public Dog(String name, String color, String gender, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void dogDetails(){
        System.out.println("************************************");
        System.out.println("Dog Name: " + getName());
        System.out.println("Dog Age: " + getAge());
        System.out.println("Dog Color: " + getColor());
        System.out.println("Dog Gender: " + getGender());
        System.out.println("************************************");
    }
}
