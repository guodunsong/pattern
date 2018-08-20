package com.dsguo.strategy;

@com.dsguo.strategy.PriceRegion(max = 10000)
public class Orgnic implements com.dsguo.strategy.CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
