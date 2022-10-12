package com.accenture.day4.abstraction;

public class AbstractionDemo {

    /*
    * Abstraction - hiding data from the users
    * "abstract"
    * -when you are dealing with abstract class, you cannot instantiate the class that has the word "abstract"
    * */

    public static void main(String[] args) {
        Animal animal = new Elephant();
        animal.setName("Cubby");
        animal.details();
    }
}
