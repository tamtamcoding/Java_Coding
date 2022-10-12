package com.accenture.day7.designpattern.factorydesign;

public class CarExceptionClass extends Exception{

    public static final String EMPTY_CAR_NAME =
            "The input entered is empty. Try adding a value to the brand of car.";
    public static final String NONE_EXISTING_CAR =
            "Cannot find the brand of car that your looking for. Try again.";

    public CarExceptionClass(String message) {
        super(message);
    }
}
