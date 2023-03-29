package com.game.designpatterns.creational;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
    public static EagerInitializationSingleton getInstance(){
        return instance;
    }

    //private constructor
    private EagerInitializationSingleton(){}
    public static void main(String[] args) {
        System.out.println("Object is created at the class level");
    }
}
