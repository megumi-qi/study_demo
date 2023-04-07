package com.interview.reflection;

import jdk.internal.reflect.CallerSensitive;
import jdk.internal.reflect.Reflection;

import java.lang.reflect.*;

/**
 * 暴力反射的步骤
 * 1.使用带declared方法获取私有属性
 * 2.使用setAccessible(true)方法
 */
public class AnimalInvoke {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class cls=Class.forName("com.interview.reflection.Animal");
        //有参构造的获取
        //Object o = cls.getConstructor(String.class, int.class).newInstance("bbb",13);
        //无参构造的获取
        Object o = cls.getConstructor().newInstance();
        System.out.println("o的运行类型->"+o.getClass());
        Method method=cls.getMethod("sing",String.class);
        method.invoke(o,"aaa");

        Field name=cls.getDeclaredField("name");
        name.setAccessible(true);//关闭安全性检查，提高执行效率（微小提升）
        System.out.println(name.get(o));

        Object o1 = cls.getDeclaredConstructor().newInstance();
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        System.out.println("declaredConstructors:"+declaredConstructors[0].toString());

        Field declaredField = cls.getDeclaredField("aaa");
        declaredField.setAccessible(true);
        declaredField.set(o,15);
        System.out.println(declaredField.get(null));//静态属性可以通过get(null)获得

        Field[] declaredFields = cls.getDeclaredFields();

    }
}
