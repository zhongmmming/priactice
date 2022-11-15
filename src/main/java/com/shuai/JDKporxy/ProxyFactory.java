package com.shuai.JDKporxy;

import com.shuai.proxy.Station;
import com.shuai.proxy.sellTicket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Station station = new Station();

    public sellTicket getProxObject(){
        sellTicket sellTicket = (sellTicket) Proxy.newProxyInstance(station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDKproxy");

                        Object result = method.invoke(station, args);
                        System.out.println(method.getName());
                        return result;
                    }
                });

        return sellTicket;
    }
}
