package com.itheima.proxy;

public interface UserService {
    public void loginUser(String username,String password) throws InterruptedException;
    public void deleteUser()throws InterruptedException;
    public void selectUser() throws InterruptedException;
}
