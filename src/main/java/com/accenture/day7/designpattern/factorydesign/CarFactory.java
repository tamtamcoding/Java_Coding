package com.accenture.day7.designpattern.factorydesign;

import static com.accenture.day7.designpattern.factorydesign.CarExceptionClass.EMPTY_CAR_NAME;

public class CarFactory {

    public Car getCar(String brandOfCar) throws CarExceptionClass {
        if (brandOfCar.isEmpty()){
            throw new CarExceptionClass(EMPTY_CAR_NAME);
        }
        if (brandOfCar.equalsIgnoreCase("mazda")){
            return new Mazda();
        } else if (brandOfCar.equalsIgnoreCase("lexus")){
            return new Lexus();
        } else if (brandOfCar.equalsIgnoreCase("chevrolet")) {
            return new Chevrolet();
        } else {
            throw new CarExceptionClass(CarExceptionClass.NONE_EXISTING_CAR);
        }
    }
}
