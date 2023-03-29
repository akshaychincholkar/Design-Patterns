package com.game.designpatterns.creational.factory;

public class PC extends Computer{
    String RAM;
    String HDD;
    String CPU;

    PC(String RAM, String HDD, String CPU){
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }
    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }
}
