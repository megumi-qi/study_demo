package com.interview.reflection;

public class Animal {
    private String name="加菲猫";
    public int age=13;
    private static int aaa=10;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    private Animal(String name) {
        this.name = name;
    }

    public void sing(String name){
        System.out.println(name+"喵喵喵...");
    }
    public void song(String name){
        System.out.println(name+"跳跳跳...");
    }
}
