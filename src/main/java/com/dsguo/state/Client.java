package com.dsguo.state;

public class Client {

    public static void main(String[] args) {

        //通过构造方法传入状态A
        Context context = new Context(new ConcreteStateA());
        context.dosomething();

        //设置状态B
        context.setState(new ConcreteStateB());
        context.dosomething();

    }
}
