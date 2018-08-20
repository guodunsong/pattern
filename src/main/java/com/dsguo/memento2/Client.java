package com.dsguo.memento2;

public class Client {

   public static void main(String[] args) {
       Originator originator = new Originator();
       Caretaker caretaker = new Caretaker(originator);

       originator.setState("state0");
       caretaker.createMemento();
       originator.setState("state1");
       caretaker.createMemento();
       originator.setState("state2");
       caretaker.createMemento();

       //打印出所有状态
       originator.printStates();
       System.out.println("restoring to 3");
       caretaker.restoreMemento(1);
       originator.printStates();

   }

}
