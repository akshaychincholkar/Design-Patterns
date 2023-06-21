package com.game.designpatterns.structural.bridge;

public abstract class Shape {
    // Composition - implementation
    protected Color color;
    // Constructor with implementor as input argument
    public Shape(Color color){
        this.color = color;
    }
    abstract public void applyColor();
}
