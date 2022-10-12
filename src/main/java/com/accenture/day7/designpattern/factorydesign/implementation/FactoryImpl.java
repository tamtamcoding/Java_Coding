package com.accenture.day7.designpattern.factorydesign.implementation;

import java.io.File;

//Main class
public class FactoryImpl {

    public static void main(String[] args) throws ReadFileException {
        File file = new File("C:\\Users\\erika.ramos\\IdeaProjects\\FY22.53\\src\\main\\java\\com" +
                "\\accenture\\day7\\designpattern\\factorydesign\\implementation\\faculty.txt");

        ReaderFactory readerFactory = new ReaderFactory();
        ReadFile readFile = readerFactory.getReader(file);
        readFile.read(file);
    }
}
