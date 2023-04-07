package com.interview;

import com.interview.Session1;
/**
 * 枚举
 * 私有变量构造方法/不给set方法防止属性被改写
 * 适用于类变量成员已知固定的情况
 * 如一年只有四季
 */
public class EnumSession {

    public static void main(String[] args) {
        //System.out.println(Session.spring);
        Session1 spring= Session1.SPRING;
        Session1 summer= Session1.SUMMER;
        Session1 what= Session1.WHAT;
        System.out.println(spring+""+summer+""+what+""+what.name());
        Session1[] session1s=Session1.values();
        for (Session1 session1 :session1s) {
            System.out.println(session1);
        }

    }

}
class Session{
    private String name;
    private String status;

    public static Session spring=new Session("春天","温暖");
    public static Session summer=new Session("夏天","炎热");
    public static Session fall=new Session("秋天","凉爽");
    public static Session winter=new Session("冬天","寒冷");

    private Session(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Session{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
