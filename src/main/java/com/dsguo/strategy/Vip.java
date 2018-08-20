package com.dsguo.strategy;

@com.dsguo.strategy.PriceRegion(max = 20000)
public class Vip implements com.dsguo.strategy.CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.9;
    }
}
