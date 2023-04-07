package com.interview.socket;

import org.apache.xmlbeans.impl.xb.xsdschema.All;

import java.io.IOException;
import java.net.*;

@SuppressWarnings("all")
public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] bytes = "Hello!World".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),9999);
        //
        datagramSocket.send(datagramPacket);
        //
        byte[] buf=new byte[64*1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        datagramSocket.receive(packet);

        byte[] data=packet.getData();
        System.out.println(new String(data,0,packet.getLength()));
        System.out.println("发送端退出");

        datagramSocket.close();
    }
}
