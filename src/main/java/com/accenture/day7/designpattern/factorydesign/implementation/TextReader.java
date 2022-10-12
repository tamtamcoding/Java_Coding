package com.accenture.day7.designpattern.factorydesign.implementation;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TextReader extends ReadFile{
    @Override
    public void read(File file) {
        System.out.println("Text File Reader");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                int age = Integer.parseInt(line.substring(0,2));
                LocalDate birthdate = LocalDate.parse(line.substring(2, 10), formatter);
                String name = line.substring(10);

                System.out.println("NAME: " + name + ", AGE: "+ age + ", BIRTHDATE: " + birthdate);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
