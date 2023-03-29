package com.game.designpatterns.creational;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
    public static EagerInitializationSingleton getInstance(){
        return instance;
    }
}
