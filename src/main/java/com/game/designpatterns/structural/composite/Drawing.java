package com.game.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    List<Shape> shapes = new ArrayList<>();
    @Override
    public void draw(String fillcolor) {
        for(Shape shape: shapes) System.out.println("Drawing "+shape+" with Color "+fillcolor);
    }
    public void add(Shape shape){
        shapes.add(shape);
    }
    public void remove(Shape shape){
        shapes.remove(shape);
    }
    public void clear(){
        shapes.clear();
    }
}
