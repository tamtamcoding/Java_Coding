package com.accenture.day7.designpattern.factorydesign.implementation;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CSVReader extends ReadFile{
    @Override
    public void read(File file) {
        System.out.println("CSV File Reader");
        List<Request> requests = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                LocalDate birthdate = LocalDate.parse(data[2], formatter);

                System.out.println("NAME: " + name + ", AGE: "+ age + ", BIRTHDATE: " + birthdate);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
