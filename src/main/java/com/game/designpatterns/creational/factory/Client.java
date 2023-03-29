package com.game.designpatterns.creational.factory;

public class Client {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","8GB","segate","i2");
        Computer server = ComputerFactory.getComputer("Server","32GB","segate","19");

        System.out.println(pc);
        System.out.println(server);
    }
}
