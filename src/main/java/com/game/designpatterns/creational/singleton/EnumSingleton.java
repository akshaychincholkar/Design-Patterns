package com.game.designpatterns.creational.singleton;

enum EnumSingletonEnum {
    INSTANCE;
    public static void doSomething(){
        //do something
    }

}

public class EnumSingleton{
    public static void main(String[] args) {
        System.out.println("To overcome this situation with Reflection, Joshua Bloch suggests the use of\n" +
                "Enum to implement Singleton design pattern as Java ensures that any enum\n" +
                "value is instantiated only once in a Java program. Since Java Enum values\n" +
                "are globally accessible, so is the singleton. The drawback is that the enum\n" +
                "type is somewhat inflexible; for example, it does not allow lazy\n" +
                "initialization.");
    }
}