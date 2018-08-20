package com.dsguo.strategy;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CalPriceFactory {

    //这里是一个常量，表示我们扫描策略的包
    private static final String CAL_PRICE_PACKAGE = "com.dsguo.strategy";
    private ClassLoader classLoader = getClass().getClassLoader();
    //策略表
    private List<Class<? extends com.dsguo.strategy.CalPrice>> calPriceList;

    /**
     * 单例
     */
    private CalPriceFactory() {
        init();
    }

    /**
     * 在工厂初始化时要初始化策略列表
     */
    private void init() {
        calPriceList = new ArrayList<Class<? extends com.dsguo.strategy.CalPrice>>();
        File[] resources = getResources();
        Class<com.dsguo.strategy.CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<com.dsguo.strategy.CalPrice>)classLoader.loadClass(com.dsguo.strategy.CalPrice.class.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("未找到策略接口");
        }

        for (int i = 0; i < resources.length; i++) {
            Class<?> clazz = null;
            try {

                String name = CAL_PRICE_PACKAGE + "." + resources[i].getName().replace(".class", "");
                if (name.startsWith(".")) {
                    name = name.substring(1);
                }

                clazz = classLoader.loadClass(name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            //判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
            if (com.dsguo.strategy.CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                calPriceList.add((Class<? extends com.dsguo.strategy.CalPrice>) clazz);
            }
        }
    }

    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    public static class CalPriceFactoryInstance {
        private static CalPriceFactory  instance = new CalPriceFactory();
    }

    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    //我们只扫描class文件
                    if (pathname.getName().endsWith(".class")) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException("未找到策略资源");
        }

    }


    /**
     * 根据客户的总金额产生相应的策略
     * @param player
     * @return
     */
    public com.dsguo.strategy.CalPrice createCalPrice(com.dsguo.strategy.Player player) {

        for (Class<? extends com.dsguo.strategy.CalPrice> clazz: calPriceList) {
            //获取该策略的注解
            com.dsguo.strategy.PriceRegion validRegion = handleAnnotation(clazz);
            //判断金额是否在注解的区间
            if (player.getTotalAmount() > validRegion.min() && player.getTotalAmount() < validRegion.max()) {
                try {
                    //是的话我们返回一个当前策略的实例
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("策略获得失败");
                }
            }
        }

        throw new RuntimeException("策略获得失败");

    }


    private com.dsguo.strategy.PriceRegion handleAnnotation(Class<? extends com.dsguo.strategy.CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }

        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i] instanceof com.dsguo.strategy.PriceRegion) {
                return (com.dsguo.strategy.PriceRegion) annotations[i];
            }
        }

        return null;
    }


}
