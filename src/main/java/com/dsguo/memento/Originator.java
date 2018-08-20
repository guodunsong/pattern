package com.dsguo.memento;

public class Originator {

    private String state;

    /**
     * 工厂方法，返回一个新的备忘录对象
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }


    /**
     * 将发起人恢复到备忘录对象所记载的状态
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        System.out.println("当前状态：" + state);
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
