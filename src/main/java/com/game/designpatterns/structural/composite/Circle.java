package com.game.designpatterns.structural.composite;

public class Circle implements Shape{

    @Override
    public void draw(String fillcolor) {
        System.out.println("Drawing circle with color "+fillcolor);
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
