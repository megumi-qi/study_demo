package com.interview.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 字符流
 */
@SuppressWarnings("all")
public class SocketTcp03Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),2222);
        System.out.println("客户端连接2222端口成功"+socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("客户端:我是客户端2");
        bufferedWriter.newLine();//表示写入内容结束
        bufferedWriter.flush();//字符流需要手动刷新

        //通过socket.getInputStream读取服务端写入到数据通道的数据
        InputStream inputStream=socket.getInputStream();
        //字符流IO读取
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s=bufferedReader.readLine();
        System.out.println(s);

        //关闭资源
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端2退出");
    }
}
