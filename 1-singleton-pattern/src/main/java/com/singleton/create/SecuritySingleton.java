package com.singleton.create;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * description: 单例防止反射漏洞攻击
 * date: 2020/9/8 23:33
 * author: Calvin
 * version: 1.0
 */
public class SecuritySingleton {

    /** 只能允许初始化化一次即可。**/
    private static Boolean flag = false;

    private static SecuritySingleton lazy;

    private SecuritySingleton(){
        /** 只能允许初始化化一次即可, 否则为不是相同标志位，则抛出异常 **/
        if (flag == false) {
            flag = !flag;
            System.out.println("我是懒汉式，初始化时，我不会创建对象; 需要我的时候，我才会创建对象; 我线程不安全, 所以需要加上 synchronized锁, 加上后我的效率比较慢");
        } else {
            throw new RuntimeException("单例模式被侵犯！");
        }

    }


    /**
     * 获取一个实例
     */
    private SecuritySingleton getInstance() {
        System.out.println("实例化....");
        if (lazy == null) {
            lazy = new SecuritySingleton();
        }
        return lazy;
    }

    /**
     * 运行测试
     *
     * @param args 参数
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /** 通过反射破解单例模式 */
        Class<?> class1 = Class.forName("com.singleton.create.SecuritySingleton");
        // 1. 获取该类的构造函数
        Constructor<?>[] declaredConstructors = class1.getDeclaredConstructors();
        // 2. 设置允许访问
        declaredConstructors[0].setAccessible(Boolean.TRUE);
        // 3. 实例化
        SecuritySingleton o1 = (SecuritySingleton) declaredConstructors[0].newInstance();
        // 4. 获取方法，该方法是实例化对象
        Method method = class1.getDeclaredMethod("getInstance", null);
        method.setAccessible(true);
        // 5. 进行二次创建
        Object o2 = method.invoke(o1, null);
        // 6. 判断：2个对象是否相等，如果相等说明他是单例，否则不是
        System.out.println(o1 == o2);
    }
}
