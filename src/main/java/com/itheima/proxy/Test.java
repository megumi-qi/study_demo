package com.itheima.proxy;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());
        userService.loginUser("root","123456");
        userService.deleteUser();
        userService.selectUser();
    }
}
