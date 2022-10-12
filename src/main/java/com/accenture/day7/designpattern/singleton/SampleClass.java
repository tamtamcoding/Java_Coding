package com.accenture.day7.designpattern.singleton;

import java.util.List;

public class SampleClass {

    public static List<String> newMethod(){
        Cart cart = Cart.getCart();

        cart.addItem("mirror");
        cart.addItem("television");
        cart.addItem("satellite");

        return cart.getItems();
    }
}
