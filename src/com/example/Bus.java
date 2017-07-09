package com.example;


public class Bus extends Transport implements TransportActions{

    @Override
    public void on() {
        System.out.println("Bus is on.");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopped.");
    }

    @Override
    public void go() {
        System.out.println("Bus rides.");
    }
}
