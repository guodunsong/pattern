package com.dsguo.state;

public class ConcreteStateA implements State {

    @Override
    public void dosomething() {
        System.out.println("现在状态为A，做一些事情");
    }
}
