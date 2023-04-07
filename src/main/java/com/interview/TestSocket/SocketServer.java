package com.interview.TestSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        Integer port=8888;
        //创建端口
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务端在"+port+"端口等待连接...");
        //等待连接
        Socket socket = serverSocket.accept();
        System.out.println("服务端:连接成功");
        //读取客户端发送的数据
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] data=bufferedInputStream.readAllBytes();
        //将读到的数据写入到特定路径
        String path="D:\\aaa.jpg";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));
        bufferedOutputStream.write(data);
        //回复客户端收到数据
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream1.write("服务端已收到图片".getBytes());
        bufferedOutputStream1.flush();
        socket.shutdownOutput();

        //资源关闭
        bufferedOutputStream.close();
        bufferedOutputStream1.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端关闭");
    }
}
