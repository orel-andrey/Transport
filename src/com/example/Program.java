package com.example;


public class Program {

    public static void main(String[] args) {

        TransportActions car = new Car();
        car.on();
        car.go();
        car.stop();

        TransportActions bus = new Bus();
        bus.on();
        bus.go();
        bus.stop();

        TransportActions ship = new Ship();
        ship.on();
        ship.go();
        ship.stop();

    }

}

