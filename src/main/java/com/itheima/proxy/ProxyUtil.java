package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxy(UserService userService){
        UserService userServiceProxy= (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                new Class[]{UserService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("loginUser".equals(method.getName())||"selectUser".equals(method.getName())||"deleteUser".equals(method.getName())){
                            long startTime = System.currentTimeMillis();

                            Object rs=method.invoke(userService,args);

                            long endTime = System.currentTimeMillis();
                            System.out.println(method.getName()+"执行耗时"+(endTime-startTime)/1000+"s");
                            return rs;
                        }else {
                            Object rs=method.invoke(userService,args);
                            return rs;
                        }
                    }
                });
        return userServiceProxy;
    }
}
