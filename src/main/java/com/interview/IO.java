package com.interview;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FileInputStream/FileOutputStream           字节流
 * FileReader/FileWriter                      字符流
 * BufferedInputStream/BufferedOutputStream   比FileInputStream/FileOutputStream了一个缓冲区效率更高
 * BufferedReader/BufferedWriter              比FileReader/FileWriter多了一个缓冲区效率更高
 * IntPutStreamReader/OutputStreamWriter      缓冲流，作为字符流和字节流之间的桥接
 */
public class IO {
    List list = new ArrayList();
    public static void main(String[] args) {
        IO io=new IO();
        io.ReadFile02();
        io.WriteFile();
    }

    /**
     * FileInputStream字节流读取
     */
    @Test
    public void ReadFile01(){
        String path="d:"+ File.separator+"hello.txt";
        FileInputStream fileInputStream=null;
        int read;
        try {
            fileInputStream=new FileInputStream(path);
            while((read=fileInputStream.read())!=-1){
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    /**
     *FileOutputStream写入数据
     */
    public void WriteFile(){
        String path="D:"+File.separator+"heihei.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path,true);//append是否覆盖
            String str ="";
            for (int i = 0; i < list.size(); i++) {
                str+=list.get(i);
            }
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * FileReader 字符流读取
     */
    @Test
    public void ReadFile02(){
        String path="d:"+ File.separator+"hello.txt";
        FileReader fileReader=null;
        int read;
        try {
            fileReader=new FileReader(path);
            while((read=fileReader.read())!=-1){
                list.add((char)read);
            }
            System.out.print(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    /**
     * 文件拷贝
     */
    public void InputAndOutput(){
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        String separator=File.separator;
        String starPath="D:"+separator+"阿里云盘"+separator+"localHost"+separator+
                "ほうき星作品合集 [2.02 GB]"+separator+"ほうき星"+separator+"22"+separator+
                "原神 绫华"+separator+"1.jpg";
        String endPath="D:"+separator+"2.jpg";

        try {
            fileInputStream=new FileInputStream(starPath);
            fileOutputStream=new FileOutputStream(endPath);
            int read=0;
            byte buff[]=new byte[1024];

            while ((read=fileInputStream.read(buff))!=-1){
                fileOutputStream.write(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
