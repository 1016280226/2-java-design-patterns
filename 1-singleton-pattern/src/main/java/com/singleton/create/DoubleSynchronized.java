package com.singleton.create;

/**
 * description: 双重检验锁
 * date: 2020/9/8 23:22
 * author: Calvin
 * version: 1.0
 */
public class DoubleSynchronized {

    private static DoubleSynchronized doubleSynchronized;

    private DoubleSynchronized(){
        System.out.println("我是双重检验锁，可能出现多次创建对象, 通过synchronized上锁, JVM本质重排序的原因, 性能最慢");
    }


    /**
     * 获取一个实例
     */
    public DoubleSynchronized getInstance() {

        if (doubleSynchronized == null) {
            synchronized (this) {
                if (doubleSynchronized == null) {
                    System.out.println("实例化....");
                    doubleSynchronized = new DoubleSynchronized();
                }
            }
        }
        return doubleSynchronized;
    }

    /**
     * 运行测试
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        DoubleSynchronized object1 = new DoubleSynchronized().getInstance();
        DoubleSynchronized object2 = new DoubleSynchronized().getInstance();
        // 判断：2个对象是否相等，如果相等说明他是单例，否则不是
        System.out.println(object1 == object2);
    }
}
