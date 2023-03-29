package com.game.designpatterns.creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance = null;

    // private constructor
    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance(){
        if(instance==null) {
            instance = new LazyInitializationSingleton();
            return instance;
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("The above implementation works fine in case of single threaded environment but when it comes to multithreaded systems," +
                "\nit can cause issues if multiple threads are inside the if loop at the same time. It will destroy " +
                "\nthe singleton pattern and both threads will get the different instances of singleton class.");
    }
}
