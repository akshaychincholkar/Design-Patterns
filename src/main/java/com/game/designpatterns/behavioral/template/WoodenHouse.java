package com.game.designpatterns.behavioral.template;

public class WoodenHouse extends HouseTemplate{
    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with wood coating");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }
}
