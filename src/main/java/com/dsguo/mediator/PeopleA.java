package com.dsguo.mediator;

public class PeopleA extends People {

    public PeopleA(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println("[A] 收到消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("[A] 发出消息：" + message);
    }
}
