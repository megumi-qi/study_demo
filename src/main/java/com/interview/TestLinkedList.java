package com.interview;

public class TestLinkedList {
    public static void main(String[] args) {
        Node keqing = new Node("刻晴");
        Node hutao = new Node("胡桃");
        Node xiaogong = new Node("宵宫");

        //keqing->hutao->xiaogong
        keqing.next=hutao;
        hutao.next=xiaogong;

        //xiaogong->hutao->keqing
        xiaogong.prev=hutao;
        hutao.prev=keqing;

        //头节点和尾节点
        Node first=keqing;
        Node last=xiaogong;

        while (true){
            if (first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }
        while (true){
            if (last==null){
                break;
            }
            System.out.println(last);
            last=last.prev;
        }
    }
}
class Node{
    Object item;
    Node prev;
    Node next;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
    /*public Node add(Object item){
        if (prev==null){

        }
    }*/
}
