package com.interview;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger=new BigInteger("999999999999999");
        BigInteger bigInteger1=new BigInteger("1898");

        //加
        BigInteger bigInteger2=bigInteger.add(bigInteger1);
        System.out.println(bigInteger2);
        //减
        BigInteger bigInteger3=bigInteger.subtract(bigInteger1);
        System.out.println(bigInteger3);
        //乘
        BigInteger bigInteger4=bigInteger.multiply(bigInteger1);
        System.out.println(bigInteger4);
        //除
        BigInteger bigInteger5=bigInteger.divide(bigInteger1);
        System.out.println(bigInteger5);

        BigDecimal bigDecimal = new BigDecimal("1.99999999999999999999989999");
        BigDecimal bigDecimal1 = new BigDecimal("4.333333333333333333");

        BigDecimal bigDecimal2=bigDecimal1.add(bigDecimal);
        //如果有无限循环小数 保留分子的精度
        BigDecimal bigDecimal3 = bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);


    }
}
