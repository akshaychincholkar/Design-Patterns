package com.game.designpatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("*****************");
        LuxuryCar luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();

    }
}
