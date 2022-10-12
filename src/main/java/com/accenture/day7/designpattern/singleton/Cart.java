package com.accenture.day7.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

//object persisting in the project
public class Cart {
    /*
    * Goals
    * 1. have the object persists
    * 2. preventing users from instantiating more than one object of class
    * 3. get global access to the object --> "static"
    * */

    private static Cart cart = new Cart();

    public static Cart getCart() {
        return cart;
    }

    public static void setCart(Cart cart) {
        Cart.cart = cart;
    }

    private List<String> items = new ArrayList<>();

    public void addItem(String name){
        items.add(name);
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
