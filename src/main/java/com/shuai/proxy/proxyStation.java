package com.shuai.proxy;

public class proxyStation implements sellTicket{
    private Station station = new Station();

    @Override
    public void sell() {
        System.out.println("代理卖票");
        station.sell();
    }

    @Override
    public void back() {
        System.out.println("代理退票");
        station.back();
    }
}
