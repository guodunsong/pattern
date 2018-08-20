package com.dsguo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本类（相当于ObjectStruture）
 */
public class AccountBook {

    //单子列表
    private List<Bill> bills = new ArrayList<Bill>();

    /**
     * 添加单子
     * @param bill
     */
    public void addBill(Bill bill) {
        bills.add(bill);
    }

    /**
     * 供账本的查看者查看账本
     * @param viewer
     */
    public void show(AccountBookViewer viewer) {
        for (Bill bill: bills) {
            bill.accept(viewer);
        }
    }

}
