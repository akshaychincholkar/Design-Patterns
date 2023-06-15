package com.game.designpatterns.structural.adapter;

//using class adapter implementation - inheritance
public class SocketAdapterImpl extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get60Volts() {
        return convertToVolt(getVolt(),2);
    }

    @Override
    public Volt get30Volts() {
        return convertToVolt(getVolt(),4);
    }
    private Volt convertToVolt(Volt v,int i){
        return new Volt(v.getVolts()/i);
    }
}
