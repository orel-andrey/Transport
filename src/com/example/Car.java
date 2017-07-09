package com.example;


public class Car extends Transport implements TransportActions {


    @Override
    public void go() {
        System.out.println("Car rides.");
    }

    public void on() {
        System.out.println("Car is on.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

}
