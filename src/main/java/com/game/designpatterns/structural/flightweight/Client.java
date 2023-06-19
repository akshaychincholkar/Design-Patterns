package com.game.designpatterns.structural.flightweight;

public class Client {
    public static void main(String[] args) {
        String[] colors = {"red","blue","green","yellow"};
        for(int i = 0;i<20;i++){
            Circle circle = (Circle) ShapeFactory.getShape(colors[(int)(Math.random()*colors.length)]);
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*100));
            circle.setRadius((int)(Math.random()*100));
            circle.draw();
        }
    }
}
