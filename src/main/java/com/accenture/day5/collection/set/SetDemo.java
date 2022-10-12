package com.accenture.day5.collection.set;

import com.accenture.day5.collection.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    /*
    * Set - does not allow any duplications (last in, first out)
    * 1. HashSet - does not allow insertion method
    * 2. TreeSet - sorts elements by ascending order
    * 3. LinkedHashSet - retain insertion method
    * */

    public static void main(String[] args) {
        //Set<WrapperClass/Class> variableName = new HashSet<>();
        System.out.println("HASH SET SAMPLE");
        Set<String> places = new HashSet<>();
        places.add("Miami");
        places.add("Hongkong");
        places.add("Malaysia");
        places.add("Philippines");
        places.add("Indonesia");
        places.add("Australia");
        places.add("Paris");
        places.add("Japan");
        places.add("Miami");
        places.add("Philippines");
        System.out.println("set of places: " + places);

        System.out.println("TREE SET SAMPLE");
        Set<String> arrangePlaces = new TreeSet<>();
        arrangePlaces.addAll(places);
        System.out.println("Arrange places to ascending order: " + arrangePlaces);

        System.out.println("LINKED HASH SET SAMPLE");
        Set<String> computerItems = new LinkedHashSet<>();
        computerItems.add("keyboard");
        computerItems.add("mouse");
        computerItems.add("speaker");
        computerItems.add("headphones");
        computerItems.add("monitor");
        computerItems.add("hdd");
        computerItems.add("keyboard");
        computerItems.add("speaker");
        System.out.println("set of computer items: " + computerItems);

        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(new Employee(1, "Johnny Depp", "johnnydepp@test.com"));
        employees.add(new Employee(2, "Jason Mayer", "jasonmayer@test.com"));
        employees.add(new Employee(2, "Elen Smith", "jasonmayer@test.com"));
        System.out.println("set of employees: " + employees);
    }
}
