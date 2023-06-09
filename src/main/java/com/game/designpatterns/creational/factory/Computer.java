package com.game.designpatterns.creational.factory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    public String toString(){
        return "RAM: "+getRAM()+" HDD: "+getHDD()+" CPU:"+getCPU();
    }
}
