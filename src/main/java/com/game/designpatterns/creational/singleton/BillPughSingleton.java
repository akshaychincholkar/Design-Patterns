package com.game.designpatterns.creational.singleton;

public class BillPughSingleton {
    //private constructor
    private BillPughSingleton(){}

    private static class BillPughHelper{
        public static final BillPughSingleton instance = new BillPughSingleton();
        public static BillPughSingleton getInstance(){
            return instance;
        }
    }

    public static void main(String[] args) {
        BillPughSingleton instance = BillPughHelper.getInstance();
        System.out.println("Notice the private inner static class that contains the instance of the\n" +
                "singleton class. When the singleton class is loaded, SingletonHelper class is\n" +
                "not loaded into memory and only when someone calls the getInstance\n" +
                "method, this class gets loaded and creates the Singleton class instance.\n" +
                "This is the most widely used approach for Singleton class as it doesn’t\n" +
                "require synchronization.");
    }
}
