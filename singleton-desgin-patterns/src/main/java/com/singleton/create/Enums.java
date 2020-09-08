package com.singleton.create;

/**
 * description: 单例模式-枚举方式
 * date: 2020/9/8 22:24
 * author: Calvin
 * version: 1.0
 */
public class Enums {

    /**
     * 私有一个枚举单例
     */
    private enum EnumSingleton {
        INSTANCE;
        private Enums enums;

        EnumSingleton() {
            System.out.println("我是枚举 EnumSingleton，通过我的构造方法，创建当前类 Enums 对象");
            enums = new Enums();
        }

        public Enums getInstance() {
            return enums;
        }

    }

    /**
     * 获取实例化
     * @return Enums 对象
     */
    public static Enums getInstance() {
        System.out.println("实例化....");
        return EnumSingleton.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        Enums e01 = Enums.getInstance();
        Enums e02 = Enums.getInstance();
        System.out.println(e01 == e02);
    }

}
