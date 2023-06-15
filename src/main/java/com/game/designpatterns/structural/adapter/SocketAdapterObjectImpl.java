package com.game.designpatterns.structural.adapter;

public class SocketAdapterObjectImpl implements SocketAdapter{
    Socket socket;
    SocketAdapterObjectImpl(){
        socket = new Socket();
    }
    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get60Volts() {
        return convertToVolt(socket.getVolt(),2);
    }

    @Override
    public Volt get30Volts() {
        return convertToVolt(socket.getVolt(),4);
    }
    private Volt convertToVolt(Volt volt,int i){
        return new Volt(volt.getVolts()/i);
    }
}
