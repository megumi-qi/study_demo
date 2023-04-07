package com.itheima.proxy;

import org.springframework.stereotype.Component;

@Component
public class ProjectService implements UserService {
    @Override
    public void loginUser(String username, String password) throws InterruptedException {
        System.out.println("username,password");
    }

    @Override
    public void deleteUser() {
    }

    @Override
    public void selectUser() throws InterruptedException {
        System.out.println("没有客户");
    }
}
