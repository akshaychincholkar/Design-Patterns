package com.game.designpatterns.structural.flightweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String,Shape> map = new HashMap<>();

    public static Shape getShape(String color){
        if(map.containsKey(color)){
            return map.get(color);
        }else{
            Circle circle = new Circle(color);
            map.put(color,circle);
            System.out.println("Creating the circle with color "+color);
            return circle;
        }
    }
}
