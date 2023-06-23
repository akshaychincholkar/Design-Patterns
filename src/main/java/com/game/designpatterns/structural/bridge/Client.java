package com.game.designpatterns.structural.bridge;



public class Client {
    public static void main(String[] args) {
        Shape circle  = new Circle(new RedColor());
        Shape rectangle = new Rectangle(new GreenColor());

        circle.applyColor();
        rectangle.applyColor();
    }
}
