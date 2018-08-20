package com.dsguo.simplefactory;

/**
 * 兰州拉面（具体的产品类）
 */
public class LzNoodles implements Noodles {

    @Override
    public void desc() {
        System.out.println("兰州拉面 上海的好贵 家里才5 6块钱一碗");
    }
}
