package com.singleton.create;

/**
 * description: 静态内部类方式: 它结合了饿汉式和懒汉式优点: 线程安全、效率高、具有懒加载
 * date: 2020/9/8 23:05
 * author: Calvin
 * version: 1.0
 */
public class StaticInnerClass {

    private StaticInnerClass () {
        System.out.println("我是静态内部类方式的单例模式，我结合了懒汉式和饿汉式的有优点;" +
                "为什么我会有这个特性了？ 因为当外部类调用内部类, 内部类才会被初始化，所以我具备懒加载功能");
    }

    /**
     * 一个静态内部类
     */
    public static class InnerClassSingleton {

        static final StaticInnerClass staticInnerClass = new StaticInnerClass();

    }

    /**
     * 获取一个实例
     */
    private static StaticInnerClass getInstance() {
        System.out.println("实例化....");
        return InnerClassSingleton.staticInnerClass;
    }

    /**
     * 运行测试
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        StaticInnerClass object1 = getInstance();
        StaticInnerClass object2 = getInstance();
        // 判断：2个对象是否相等，如果相等说明他是单例，否则不是
        System.out.println(object1 == object2);
    }
}
