package com.interview;

public enum Session1 {
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    WHAT;//调用无参构造

    Session1() {
        System.out.println("无参构造被调用了");
    }

    @Override
    public String toString() {
        return "Session1{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    ;
    private String name;
    private String status;

    private Session1(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
