package com.interview.TestSocket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket=null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 8888);
        } catch (IOException e) {
            throw new IOException("服务器8888端口未启动");
        }
        String path="d:\\2.jpg";
        //创建读磁盘的输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
        byte[] data=bufferedInputStream.readAllBytes();
        //通过socket获取输出流，将bytes数据发给服务端
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(data);
        socket.shutdownOutput();
        //bufferedOutputStream
        //接受服务端消息
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(bufferedReader.readLine());
        //socket.shutdownOutput();

        //资源关闭
        bufferedReader.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
