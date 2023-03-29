package com.game.designpatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("8GB","Segate","i2"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB","Segate","i9"));

        System.out.println(pc);
        System.out.println(server);
    }
}


