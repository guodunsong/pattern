package com.dsguo.mediator;

public interface Mediator {

    /**
     * 发送消息
     * @param p
     * @param message
     */
    void chat(People p, String message);
}
