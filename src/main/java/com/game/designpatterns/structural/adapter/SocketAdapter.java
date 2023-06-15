package com.game.designpatterns.structural.adapter;

public interface SocketAdapter {
    Volt get120Volts();
    Volt get60Volts();
    Volt get30Volts();
}
