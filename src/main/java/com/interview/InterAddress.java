package com.interview;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterAddress {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //根据主机名字获取InetAddress对象
        InetAddress localHost1=InetAddress.getByName("LAPTOP-DS96LOPN");
        System.out.println(localHost1);
        //根据域名获取百度的InetAddress对象
        InetAddress localHost2=InetAddress.getByName("www.baidu.com");
        System.out.println(localHost2);
        //通过InetAddress对象获取地址
        String hostAddress=localHost2.getHostAddress();
        System.out.println(hostAddress);
        //通过InetAddress对象获取对应的主机名/域名
        String hostName=localHost2.getHostName();
        System.out.println(hostName);
    }
}
