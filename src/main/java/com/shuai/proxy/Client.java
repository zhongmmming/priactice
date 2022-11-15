package com.shuai.proxy;

public class Client {
    public static void main(String[] args) {
        proxyStation station = new proxyStation();
        station.sell();
        station.back();
    }
}
