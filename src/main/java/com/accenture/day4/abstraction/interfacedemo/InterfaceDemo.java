package com.accenture.day4.abstraction.interfacedemo;

public class InterfaceDemo {
    //interface is a 100% abstraction

    public static void main(String[] args) {
        Employee employee = new Admin();
        employee.detail();
    }
}
