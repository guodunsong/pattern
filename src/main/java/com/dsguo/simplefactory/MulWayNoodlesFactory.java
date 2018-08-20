package com.dsguo.simplefactory;

/**
 * 多方法工厂（常用）
 */
public class MulWayNoodlesFactory {


    public static Noodles createPm() {
        return new PaoNoodles();
    }

    public static Noodles createLz() {
        return new LzNoodles();
    }

    public static Noodles createGk() {
        return new GankouNoodles();
    }
}
