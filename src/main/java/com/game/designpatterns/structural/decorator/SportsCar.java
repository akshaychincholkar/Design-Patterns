package com.game.designpatterns.structural.decorator;

public class SportsCar extends CarDecorator{

    SportsCar(Car car){
        super(car);
    }
    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding feature of a Sports car");
    }
}
