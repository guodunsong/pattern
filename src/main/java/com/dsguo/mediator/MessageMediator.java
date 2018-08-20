package com.dsguo.mediator;

public class MessageMediator implements Mediator {

    private PeopleA a;
    private PeopleB b;
    private PeopleC c;

    public void setA(PeopleA a) {
        this.a = a;
    }

    public void setB(PeopleB b) {
        this.b = b;
    }

    public void setC(PeopleC c) {
        this.c = c;
    }

    @Override
    public void chat(People p, String message) {
        if (p instanceof PeopleA) {
            a.send(message);
            b.receive(message);
            c.receive(message);
        } else if (p instanceof PeopleB) {
            b.send(message);
            a.receive(message);
            c.receive(message);
        } else if (p instanceof PeopleC) {
            c.send(message);
            a.receive(message);
            b.receive(message);
        }
    }
}
