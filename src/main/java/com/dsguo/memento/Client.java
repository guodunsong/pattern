package com.dsguo.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        //改变发起人的状态
        originator.setState("on");
        originator.getState();

        //创建备忘录对象，并将发起人对象的状态存储起来
        caretaker.saveMemento(originator.createMemento());

        originator.setState("off");
        originator.getState();


        //恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());
        originator.getState();
    }
}
