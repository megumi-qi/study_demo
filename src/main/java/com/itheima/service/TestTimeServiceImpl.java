package com.itheima.service;

import org.springframework.stereotype.Service;

@Service
public class TestTimeServiceImpl implements TestTimeService{

    public void getTime() {
        System.out.println(System.currentTimeMillis());
        System.out.println("getTime....");
    }
    public void update(){
        System.out.println("update....");
    }
    public void delete(){
        System.out.println("delete....");
    }
    public void select(){
        System.out.println("select....");
    }
}
