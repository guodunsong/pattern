package com.dsguo.mediator;

public class PeopleB extends People {

    public PeopleB(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println("[B] 收到消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("[B] 发出消息：" + message);
    }
}
