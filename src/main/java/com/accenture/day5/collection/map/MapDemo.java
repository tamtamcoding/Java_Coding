package com.accenture.day5.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    /*
    * Map - key and value pair
    *   > key - it must be unique
    *   --> first in first out
    *
    * 1. HashMap - does retain insertion method
    * 2. TreeMap - sorts elements by ascending order
    * 3. LinkedHashMap - retains insertion method
    * */

    public static void main(String[] args) {
        //Map<Key, Value> variableName = new HashMap<>();
        //Key/Value - Wrapper Class or class
        System.out.println("HASH MAP SAMPLE");
        Map<Integer, String> ageNameSample = new HashMap<>();
        ageNameSample.put(35, "johny");
        ageNameSample.put(43, "english");
        ageNameSample.put(27, "wynnona");
        ageNameSample.put(16, "adele");
        ageNameSample.put(35, "dj");
        ageNameSample.put(12, "ethan");
        ageNameSample.put(24, "joy");
        ageNameSample.put(27, "ace");
        System.out.println("Age and Name Sample: " + ageNameSample);


        System.out.println("TREE MAP SAMPLE");
        Map<Integer, String> arranged = new TreeMap<>();
        arranged.putAll(ageNameSample);
        System.out.println("Arranged Age and Name Sample: " + arranged);

        System.out.println("LINKED HASH MAP SAMPLE");
        Map<String, Integer> cars = new LinkedHashMap<>();
        cars.put("mazda", 1);
        cars.put("chev", 3);
        cars.put("toyota", 2);// removed
        cars.put("mitsubishi", 8);
        cars.put("lexus", 7);
        cars.put("bmw", 14);
        cars.put("isuzu", 10);
        cars.put("toyota", 14);// replaced to the value of the "toyota", 1
        System.out.println("ranking of cars: " + cars);


    }
}
