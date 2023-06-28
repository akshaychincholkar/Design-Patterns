package com.game.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("bittu","wrong_pwd");
        try{
            executor.runCommand("java -v");
            executor.runCommand(" rm -rf abc.txt");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
