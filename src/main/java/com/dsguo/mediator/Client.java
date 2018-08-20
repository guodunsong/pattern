package com.dsguo.mediator;

public class Client {

    public static void main(String[] args) {
        MessageMediator mediator = new MessageMediator();
        PeopleA a = new PeopleA(mediator,"A");
        PeopleB b = new PeopleB(mediator, "B");
        PeopleC c = new PeopleC(mediator, "C");

        mediator.setA(a);
        mediator.setB(b);
        mediator.setC(c);

        mediator.chat(a,"中午吃啥饭？");
        System.out.println();
        mediator.chat(b, "我想是豆腐");
        System.out.println();
        mediator.chat(c,"行，一起吃豆腐");
        System.out.println();

    }
}
