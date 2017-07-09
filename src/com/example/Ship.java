package com.example;


public class Ship extends Transport implements TransportActions {
    @Override
    public void on() {
        System.out.println("Ship is on.");
    }

    @Override
    public void stop() {
        System.out.println("Ship stopped.");
    }

    @Override
    public void go() {
        System.out.println("The ship is swimming.");
    }
}
