package com.interview.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcpServer {
    public static void main(String[] args) throws IOException {
        //Integer port=1111;
        Integer port=2222;
        //在port端口监听，等待连接
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务端在"+port+"端口等待连接...");
        //没有客户端连接1111端口时程序会阻塞,等待连接
        //有客户端连接,会返回socket对象,程序继续
        Socket socket=serverSocket.accept();
        System.out.println("服务端 socket="+socket.getClass());
        //通过socket.getInputStream读取客户端写入到数据通道的数据
        InputStream inputStream=socket.getInputStream();
        //IO读取
        byte[] data=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read(data))!=-1){
            System.out.println(new String(data,0,readLen));
        }
        //获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务端:hello,client".getBytes());
        //写入结束标记
        socket.shutdownOutput();

        //关闭资源
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
