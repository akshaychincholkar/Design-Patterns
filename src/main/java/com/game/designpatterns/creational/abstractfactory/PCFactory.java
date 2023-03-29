package com.game.designpatterns.creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory{
    PC pc ;
    PCFactory(String RAM,String HDD,String CPU){
        pc = new PC(RAM,HDD,CPU);
    }

    @Override
    public Computer createComputer() {
        return pc;
    }
}
