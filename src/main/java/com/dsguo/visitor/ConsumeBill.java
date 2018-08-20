package com.dsguo.visitor;

/**
 * 消费单子
 */
public class ConsumeBill implements Bill {

    private double amount;
    private String item;

    public ConsumeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.viewConsumeBill(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
