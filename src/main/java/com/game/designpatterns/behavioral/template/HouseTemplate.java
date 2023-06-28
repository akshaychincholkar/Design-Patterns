package com.game.designpatterns.behavioral.template;

public abstract class HouseTemplate {
    public void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built...\n----------------------------------");
    }

    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    // methods to be implemented by subclass as per the requirements
    public abstract void buildPillars() ;
    public abstract void buildWalls();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}
