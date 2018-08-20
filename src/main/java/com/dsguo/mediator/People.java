package com.dsguo.mediator;

/**
 * 抽象同事类  -- 聊天人员
 */
public abstract class People {
    private String name;
    private Mediator mediator;

    public People(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
    public abstract void send(String message);

}
