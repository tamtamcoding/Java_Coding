package com.accenture.day6.javaIO.objectreading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingData {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        String filePath = "C:\\Users\\erika.ramos\\IdeaProjects\\FY22.53\\src\\main\\java\\com\\accenture\\day6\\javaIO\\objectreading\\";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath+"faculty.csv"));
        String line = "";
        List<Faculty> faculties = new ArrayList<>();

        while ((line = bufferedReader.readLine()) !=null){
            String[] value = line.split(",");

            int id = Integer.parseInt(value[0]);
            Faculty faculty = new Faculty(id, value[1], value[2] );

            faculties.add(faculty);
        }
        System.out.println("Faculties: \n" + faculties);
        bufferedReader.close();

        BufferedReader br = new BufferedReader(new FileReader(filePath+"details.txt"));
        String data = "";
        List<Details> detailsList = new ArrayList<>();
        while ((data = br.readLine()) != null){
            int id = Integer.parseInt(data.substring(0, 5));//always to the add 1 to your end index if you have next word/s that you have to read
//            String clearanceLevel = data.substring(5,9);
//            String name = data.substring(9);


//            Details details = new Details(id, clearanceLevel, name);
            Details details = new Details();
            details.setId(id);
            details.setClearanceLevel(data.substring(5,9));
            details.setName(data.substring(9));

            details = new Details(details.getId(), details.getClearanceLevel(), details.getName());
            detailsList.add(details);
        }
        System.out.println("Details List: \n" + detailsList);
        br.close();
    }
}
