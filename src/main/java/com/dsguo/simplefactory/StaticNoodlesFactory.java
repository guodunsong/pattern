package com.dsguo.simplefactory;

/**
 * 利用反射Class.forName(clz.getName()).newInstance()实现的简单工厂
 */
public class StaticNoodlesFactory {


    /**
     * 传入Class实例化面条产品类
     * @param clz
     * @param <T>
     * @return
     */
    public static <T extends Noodles>T createNoodles(Class<T> clz) {
        T result = null;
        try {
            result = (T)Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
