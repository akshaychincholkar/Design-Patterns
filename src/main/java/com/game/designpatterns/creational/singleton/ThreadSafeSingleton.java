package com.game.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
    static ThreadSafeSingleton instance;

    //private constructor
    ThreadSafeSingleton(){ }

    //Thread safe singleton using synchronized method
    public synchronized static ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    public static ThreadSafeSingleton getInstanceDoubleCheck(){
        if(instance==null){
            synchronized (ThreadSafeSingleton.class){
                if(instance==null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        System.out.println("The easier way to create a thread-safe singleton class is to make the global\n" +
                "access method synchronized, so that only one thread can execute this\n" +
                "method at a time. General implementation of this approach is like the below\n" +
                "class.");
        System.out.println("Double checked: Above implementation works fine and provides thread-safety but it reduces\n" +
                "the performance because of cost associated with the synchronized method,\n" +
                "although we need it only for the first few threads who might create the\n" +
                "separate instances (Read: Java Synchronization). To avoid this extra\n" +
                "overhead every time, double checked locking principle is used. In this\n" +
                "approach, the synchronized block is used inside if condition with an\n" +
                "additional check to ensure that only one instance of singleton class is\n" +
                "created.\n" +
                "Below code snippet provides the double checked locking implementation.");
    }
}
