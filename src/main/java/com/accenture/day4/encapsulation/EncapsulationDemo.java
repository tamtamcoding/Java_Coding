package com.accenture.day4.encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {

    /*
    * Encapsulation - hiding the fields from the user by using getters and setters
    * -wrapping of data to prevent outside class from accessing it.
    * */

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setAge(2);
//        dog.setName("Cloud");
//        dog.setGender("Male");
//        dog.setColor("Black");
//        dog.dogDetails();
//
//        dog.setName("Cloud");
//        dog.setGender("Female");
//        dog.setColor("Brown");
//        dog.dogDetails();
//
//        dog.setName("Cloud");
//        dog.setGender("Female");
//        dog.setColor("Brown");
//        dog.dogDetails();

        Dog newDog = new Dog("Blue", "White", "Male", 5);
        newDog.dogDetails();

        newDog.setName("Java");
        newDog.dogDetails();



    }
}
