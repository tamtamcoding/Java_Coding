package com.accenture.day7.designpattern.factorydesign;

import java.util.Scanner;

public class FactoryDesignDemo {
    //hiding set of objects to the clients

    public static void main(String[] args) throws CarExceptionClass {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a brand of car: ");
        String brandOfCar = scanner.nextLine();

        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(brandOfCar);
        car.brandOfCar();
    }
}
