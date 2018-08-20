package com.dsguo.simplefactory;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
//        int type = SimpleNoodlesFactory.TYPE_GK;
//        Noodles noodles = SimpleNoodlesFactory.createNoodles(type);
//        noodles.desc();

        //利用反射Class.forName(clz.getName()).newInstance()实现的简单工厂
        //个人觉得不好，因为这样和简单的new一个对象一样，工厂方法应该用于复杂对象的初始化
//        Noodles lz = StaticNoodlesFactory.createNoodles(LzNoodles.class);
//        lz.desc();

        //这种我比较青睐，增加一个新面条，只要去增加一个static方法即可,也不修改原方法逻辑
        Noodles lz = MulWayNoodlesFactory.createLz();
        lz.desc();

    }
}
