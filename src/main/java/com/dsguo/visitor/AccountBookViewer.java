package com.dsguo.visitor;

/**
 * 账单查看者接口（相当于Visitor）
 */
public interface AccountBookViewer {

    /**
     * 查看消费的单子
     * @param bill
     */
    void viewConsumeBill(ConsumeBill bill);

    /**
     * 查看收入的单子
     * @param bill
     */
    void viewIncomeBill(IncomeBill bill);
}
