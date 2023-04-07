package com.interview.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTcp02Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),2222);
        System.out.println("客户端连接2222端口成功"+socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端:我是客户端2".getBytes());
        socket.shutdownOutput();
        //通过socket.getInputStream读取服务端写入到数据通道的数据
        InputStream inputStream=socket.getInputStream();
        //IO读取
        byte[] data=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read(data))!=-1){
            System.out.println(new String(data,0,readLen));
        }
        //关闭资源
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端2退出");
    }
}
