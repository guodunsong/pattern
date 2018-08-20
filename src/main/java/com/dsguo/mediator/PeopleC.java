package com.dsguo.mediator;

public class PeopleC extends People {

    public PeopleC(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println("[C] 收到消息：" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("[C] 发出消息：" + message);
    }
}
