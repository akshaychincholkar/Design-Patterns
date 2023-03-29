package com.game.designpatterns.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception ex){
            //catch exception
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n" +
                "Static block initialization implementation is similar to eager initialization, " +
                "\nexcept that instance of class is created in the static block that provides option " +
                "\nfor exception handling.");
    }
}
