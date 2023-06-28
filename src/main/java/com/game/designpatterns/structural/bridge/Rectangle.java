package com.game.designpatterns.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Drawing rectangle with color ");
        color.applyColor();
    }
}
