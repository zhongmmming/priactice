package com.shuai.proxy;

public class Station implements sellTicket{

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }

    @Override
    public void back() {
        System.out.println("sddsddsd");
        System.out.println("hotfix");
        System.out.println("master test2");
        System.out.println("hotfix test2");
        System.out.println("push test");
        System.out.println("pull test");
    }
}
