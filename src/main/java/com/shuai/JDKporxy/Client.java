package com.shuai.JDKporxy;

import com.shuai.proxy.sellTicket;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();

        sellTicket proxyObject = proxyFactory.getProxObject();

        proxyObject.sell();
        proxyObject.back();
    }
}
