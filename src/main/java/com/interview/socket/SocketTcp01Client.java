package com.interview.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTcp01Client {
    public static void main(String[] args) throws IOException {
        //连接服务端（ip,端口）如果连接成功，返回socket对象
        Socket socket = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(),1111);
        } catch (IOException e) {
            throw new IOException("服务端1111不在线");
        }
        System.out.println("客户端socket="+socket.getClass());
        //连接成功，生成socket,通过socket.getOutputStream()得到socket对象关联的输出流对象
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        //关闭资源
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
