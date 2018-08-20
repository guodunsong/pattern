package com.dsguo.strategy;

public class Client {

    public static void main(String[] args) {

        com.dsguo.strategy.Player player = new com.dsguo.strategy.Player();
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.calFinalPrice());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calFinalPrice());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calFinalPrice());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calFinalPrice());

    }
}
