package com.interview.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

@SuppressWarnings("all")
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] buf=new byte[64*1024];//UDP数据传输最大值为64k
        //
        DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
        System.out.println("接收端,接收数据...");
        datagramSocket.receive(datagramPacket);

        byte[] data=datagramPacket.getData();
        System.out.println(new String(data,0,data.length));

        byte[] bytes = "接收端已接收".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),9998);
        datagramSocket.send(packet);
        System.out.println("接收端退出");

        datagramSocket.close();
    }
}
