package com.game.designpatterns.behavioral.mediator;

public abstract class User {
    private ChatMediator mediator;
    private String name;
    User(ChatMediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
    }
    public abstract  void send(String msg);
    public abstract void receive(String msg);
}
