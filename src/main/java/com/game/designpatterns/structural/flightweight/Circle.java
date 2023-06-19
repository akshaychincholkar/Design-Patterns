package com.game.designpatterns.structural.flightweight;

public class Circle implements Shape{
    private int x,y,radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing cirle with x:"+x+" y:"+y+" radius: "+radius+" color:"+color);
    }
}
