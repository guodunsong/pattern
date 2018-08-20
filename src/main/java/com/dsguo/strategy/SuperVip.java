package com.dsguo.strategy;

@com.dsguo.strategy.PriceRegion(min = 20000, max = 30000)
public class SuperVip implements com.dsguo.strategy.CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.8;
    }
}
