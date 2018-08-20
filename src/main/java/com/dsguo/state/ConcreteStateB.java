package com.dsguo.state;

public class ConcreteStateB implements State {

    @Override
    public void dosomething() {
        System.out.println("现在状态为B，做另外一些事情");
    }
}
