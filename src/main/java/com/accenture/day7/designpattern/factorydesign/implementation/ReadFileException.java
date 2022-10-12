package com.accenture.day7.designpattern.factorydesign.implementation;

public class ReadFileException extends Exception{
    public static final String NAME_OF_FILE_IS_EMPTY =
            "Cannot read the file name of the input data. Try again.";

    public static final String FILE_DOES_NOT_EXIST =
            "The file you are looking for to read does not exists.";

    public ReadFileException(String message) {
        super(message);
    }
}
