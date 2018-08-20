package com.dsguo.memento2;

import java.util.Vector;

public class Originator {

    private Vector<Object> states;
    private int index;

    public Originator() {
        states = new Vector<Object>();
        index = 0;
    }

    /**
     * 工厂方法，返回一个新的备忘录对象
     * @return
     */
    public MementoIF createMemento() {
        return new Memento(this.states, index);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     * @param memento
     */
    public void restoreMemento(MementoIF memento) {
        states = ((Memento)memento).getStates();
        index = ((Memento)memento).getIndex();
    }

    /**
     * 状态的复制方法
     * @param state
     */
    public void setState(Object state) {
        this.states.addElement(state);
        index++;
    }

    /**
     * 辅助方法，打印出所有状态
     */
    public void printStates() {
        System.out.println("total number of states:" + index);
        for (Object o : states) {
            System.out.println(o.toString());
        }
    }

    protected class Memento implements MementoIF {

        private Vector<Object> saveStates;
        private int saveIndex;

        /**
         * states一定是Vector<Object类型的变量，复制后也一定是Vector<Object的变量
         * @param states
         * @param index
         */
        private Memento(Vector<Object> states, int index) {
            //保存客户端传来的状态对象的拷贝，否则客户端的修改会影响到保存的状态。
            saveStates = (Vector<Object>)states.clone();
            saveIndex = index;
        }

        private Vector<Object> getStates() {
            return saveStates;
        }

        private int getIndex() {
            return saveIndex;
        }
    }
}
