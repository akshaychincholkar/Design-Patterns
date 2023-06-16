package com.game.designpatterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triange = new Triangle();

        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(triange);

        drawing.draw("red");
        drawing.draw("blue");
    }
}
