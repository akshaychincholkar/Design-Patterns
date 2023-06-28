package com.game.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        testClassSocketAdapter();
        testObjectSocketAdapter();
    }

    private static void testObjectSocketAdapter() {
        System.out.println("Object Socket Adapter-----------------------");
        SocketAdapterObjectImpl socketAdapter = new SocketAdapterObjectImpl();

        Volt volt_120 = socketAdapter.get120Volts();
        Volt volt_60 = socketAdapter.get60Volts();
        Volt volt_30 = socketAdapter.get30Volts();

        System.out.println(volt_120);
        System.out.println(volt_60);
        System.out.println(volt_30);
    }

    private static void testClassSocketAdapter() {
        System.out.println("Class Socket Adapter-----------------------");
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();

        Volt volt_120 = socketAdapter.get120Volts();
        Volt volt_60 = socketAdapter.get60Volts();
        Volt volt_30 = socketAdapter.get30Volts();

        System.out.println(volt_120);
        System.out.println(volt_60);
        System.out.println(volt_30);
    }
}
