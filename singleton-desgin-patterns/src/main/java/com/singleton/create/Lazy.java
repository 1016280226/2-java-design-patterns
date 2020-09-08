package com.singleton.create;

/**
 * 单例模式-懒汉模式
 * description: 类初始化时，不会创建对象，当需要才会初始化对象
 * date: 2020/9/8 18:02
 * author: Calvin
 * version: 1.0
 */
public class Lazy {

    private static Lazy lazy;

    private Lazy(){
        System.out.println("我是懒汉式，初始化时，我不会创建对象; 需要我的时候，我才会创建对象; 我线程不安全, 所以需要加上 synchronized锁, 加上后我的效率比较慢");
    }


    /**
     * 获取一个实例
     */
    private synchronized static Lazy getInstance() {
        System.out.println("实例化....");
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

    /**
     * 运行测试
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        Lazy object1 = getInstance();
        Lazy object2 = getInstance();

        // 判断：2个对象是否相等，如果相等说明他是单例，否则不是
        System.out.println(object1 == object2);
    }

}
