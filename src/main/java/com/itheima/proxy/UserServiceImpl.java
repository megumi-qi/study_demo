package com.itheima.proxy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void loginUser(String username,String password) throws InterruptedException {
        if ("root".equals(username)&&"123456".equals(password)){
            System.out.println("欢迎"+username+"登录");
        }else{
            System.out.println("用户名或密码错误");
        }
        Thread.sleep(2000);
    }

    @Override
    public void deleteUser() throws InterruptedException {
        System.out.println("成功删除999客户");
        Thread.sleep(3000);
    }

    @Override
    public void selectUser() throws InterruptedException {
        System.out.println("查询出了999个客户:张三，李四，王五...");
        Thread.sleep(2000);
    }
}
