package com.game.designpatterns.behavioral.template;

public class Client {
    public static void main(String[] args) {
        HouseTemplate woodHouse = new WoodenHouse();
        HouseTemplate glassHouse = new GlassHouse();

        woodHouse.buildHouse();
        glassHouse.buildHouse();
    }
}
