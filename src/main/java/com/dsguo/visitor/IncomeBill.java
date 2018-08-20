package com.dsguo.visitor;

/**
 * 收入单子
 */
public class IncomeBill implements Bill {

    private double amount;
    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.viewIncomeBill(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
