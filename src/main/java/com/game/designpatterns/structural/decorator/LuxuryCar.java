package com.game.designpatterns.structural.decorator;

public class LuxuryCar extends CarDecorator{

    LuxuryCar(Car car) {
        super(car);
    }
    public void assemble(){
        car.assemble();
        System.out.println("Adding features of luxury car");
    }
}
