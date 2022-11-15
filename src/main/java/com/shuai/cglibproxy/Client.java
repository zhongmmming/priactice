package com.shuai.cglibproxy;

import com.shuai.proxy.Station;

public class Client {
    public static void main(String[] args) {
        ProxyFactoryCGlib factoryCGlib = new ProxyFactoryCGlib();
        Station station = factoryCGlib.getProxyObject();
        station.back();
        station.sell();
    }
}
