package com.dsguo.strategy;

public class Player {

    //客户在腾讯消费的总额
    private Double totalAmount = 0D;
    //客户单次消费金额
    private Double amount = 0D;
    //个客户都有一个计算价格的策略，初始都是普通计算，即原价
    private com.dsguo.strategy.CalPrice calPrice = new com.dsguo.strategy.Orgnic();


    /**
     * 客户购买皮肤，就会增加它的总额
     * @param amount
     */
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;

        calPrice = com.dsguo.strategy.CalPriceFactory.getInstance().createCalPrice(this);
    }

    /**
     * 计算客户最终要付的钱
     * @return
     */
    public Double calFinalPrice() {
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
