package com.interview;

public class TestStringBuffer {
    public static void main(String[] args) {
        /**
         * string类型不可变，每次改变地址都会重新指向
         */
        String a="aaa";
        System.out.println(a.hashCode());
        a="bbb";
        System.out.println(a.hashCode());
        //String和StringBuffer互相转化
        String str="abc";
        //直接转换
        //String --> StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        //append方式
        StringBuffer stringBuffer1 = new StringBuffer().append(str);

        //StringBuffer --> String
        //toString方法
        StringBuffer stringBuffer2 = new StringBuffer("ccc");
        String res=stringBuffer2.toString();

    }
}
