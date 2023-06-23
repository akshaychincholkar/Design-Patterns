package com.game.designpatterns.structural.bridge;

public class Circle extends Shape{
    Circle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Drawing circle with color ");
        color.applyColor();
    }
}
