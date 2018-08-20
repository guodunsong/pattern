package com.dsguo.strategy;

@com.dsguo.strategy.PriceRegion(min = 30000)
public class GoldVip implements com.dsguo.strategy.CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.7;
    }
}
