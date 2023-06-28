package com.game.designpatterns.structural.decorator;

public class CarDecorator implements Car{
    Car car;

    CarDecorator(Car car){
        this.car = car;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
