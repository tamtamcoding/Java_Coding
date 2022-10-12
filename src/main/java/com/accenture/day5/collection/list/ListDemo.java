package com.accenture.day5.collection.list;

import com.accenture.day5.collection.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    /*
    * List - is a glorified array
    *  - it maintains the ordered collection retains insertion method
    *> LinkedList
    * */

    public static void main(String[] args) {
        //List<WrapperClass/Class> variableName = new ArrayList<>();
        //Wrapper Class - Integer, Boolean, String, Double, Float, Short, Long, Char, Byte

        List<String> phones = new ArrayList<>();
        phones.add("iPhone");
        phones.add("Samsung");
        phones.add("Sony");
        phones.add("Motorola");
        phones.add("Nokia");
        phones.add("Xiaomi");
        System.out.println("List the of Phones: " + phones);
        System.out.println("Call the Sony phone: " + phones.get(2));
        System.out.println("Remove Nokia phone successful: " + phones.remove("Nokia"));
        System.out.println("List the of Phones: " + phones);
        System.out.println("Check if iphone is existing: " + phones.contains("iPhone"));

        Collections.sort(phones);
        System.out.println("Sorted list of phones: " + phones);
        Collections.reverse(phones);
        System.out.println("Reverse sorted list of phones: " + phones);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Johnny Depp", "johnnydepp@test.com"));
        employees.add(new Employee(2, "Jason Mayer", "jasonmayer@test.com"));
        System.out.println("List of Employees: " + employees);

        System.out.println("LINKED LIST SAMPLE");
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermelon");
        fruits.add("pineapple");
        fruits.add("strawberry");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("avocado");
        fruits.add("durian");
        fruits.add("mango");
        fruits.add("grapes");
        System.out.println("list of fruits: " + fruits);
        //apple index 0

        //pop method
        fruits.pop();
        //removed apple in list (index 0)
        System.out.println("pop method used: " + fruits);
        System.out.println("pop method used: " + fruits);
        //orange index 0


        //push method
        fruits.push("tamarind");
        //tamarind became the index 0
        //orange became the index 1
        System.out.println("push method used: " + fruits);

    }
}
