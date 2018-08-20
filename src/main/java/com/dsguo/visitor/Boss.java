package com.dsguo.visitor;

/**
 * 老板类，查看账本的类之一
 */
public class Boss implements AccountBookViewer {

    private double totalIncome;
    private double totalConsume;

    @Override
    public void viewConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    @Override
    public void viewIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共话费多少，数目：" + totalConsume);
        return totalConsume;
    }
}
