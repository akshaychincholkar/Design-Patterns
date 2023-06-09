package com.game.designpatterns.structural.adapter;

public class Volt {
    private int volts;

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    Volt(int volts){
        this.volts = volts;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "volts=" + volts +
                '}';
    }
}
