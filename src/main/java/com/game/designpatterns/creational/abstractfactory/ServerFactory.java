package com.game.designpatterns.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory{
    Server server;
    ServerFactory(String RAM,String HDD,String CPU){
        server = new Server(RAM,HDD,CPU);
    }
    @Override
    public Computer createComputer() {
        return server;
    }
}
