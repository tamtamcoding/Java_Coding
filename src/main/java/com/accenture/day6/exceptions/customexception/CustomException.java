package com.accenture.day6.exceptions.customexception;

public class CustomException extends Exception{

    public static final String EMPTY_NAME = "The name is empty. Try again.";
    public static final String INCORRECT_NAME =
            "The name is incorrect. Try again.";

    public CustomException(String message) {
        super(message);
    }
}
