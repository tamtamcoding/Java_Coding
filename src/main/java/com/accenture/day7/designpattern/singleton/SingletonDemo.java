package com.accenture.day7.designpattern.singleton;

public class SingletonDemo {

    //Singleton - having a single object persists throughout the project

    public static void main(String[] args) {
        Cart cart = Cart.getCart(); //getting the instance of the object by getters
        cart.addItem("bag");
        cart.addItem("table");
        cart.addItem("chair");

        System.out.println("Singleton Demo Class Items: " + cart.getItems());


        System.out.println("Sample Class Item: " + SampleClass.newMethod());
    }
}
