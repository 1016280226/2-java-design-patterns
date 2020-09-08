package com.singleton.create;

/**
 * 单例模式-饿汉方式
 * description: 类初始化时,会立即加载该对象，线程天生安全,调用效率高。
 * date: 2020/9/8 17:07
 * author: Calvin <br>
 * version: 1.0 <br>
 */
public class Hungry {

    private Hungry() {
        System.out.println("我是饿汉式，我可以立即初始化，并且线程安全，为什么了？ 因为我头上有个final不会被改变");
    }

    // 1. 定义一个全局变量，初始化对象
    // 缺点： 当对象不使用时，它会占用内存资源，因为它是static final 标识，启动时被加载到内存中去，所以在JVM中不能被回收。
    // 线程安全：是因为使用了 static final 修饰，所以该对象不会被修改，所以线程是安全的。
    private static final Hungry hungry = new Hungry();

    /**
     * 获取一个实例
     */
    private static Hungry getInstance() {
        System.out.println("实例化....");
        return hungry;
    }

    /**
     * 运行测试
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        Hungry object1 = getInstance();
        Hungry object2 = getInstance();

        // 判断：2个对象是否相等，如果相等说明他是单例，否则不是
        System.out.println(object1 == object2);
    }

}
