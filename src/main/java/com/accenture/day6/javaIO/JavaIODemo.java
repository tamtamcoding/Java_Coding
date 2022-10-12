package com.accenture.day6.javaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JavaIODemo {

    public static void main(String[] args) {
       //    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\erika.ramos\\IdeaProjects\\FY22.53\\src\\main\\java\\com\\accenture\\day6\\javaIO\\cars.csv";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("toyota\n");
            bufferedWriter.write("mazda\n");
            bufferedWriter.write("lexus\n");
            bufferedWriter.write("chev\n");
            bufferedWriter.write("mitsubishi");
            //bufferedWriter.write(32215245);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            List<String> cars = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null){
                cars.add(line);
            }
            System.out.println("Cars: " + cars);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

