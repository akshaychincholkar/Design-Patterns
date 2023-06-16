package com.game.designpatterns.structural.composite;

public class Triangle implements Shape{
    @Override
    public void draw(String fillcolor) {
        System.out.println("Drawing triange with color "+fillcolor);
    }
    @Override
    public String toString() {
        return "Triangle";
    }
}
