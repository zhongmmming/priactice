package com.shuai.cglibproxy;

import com.shuai.proxy.Station;
import com.shuai.proxy.proxyStation;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactoryCGlib implements MethodInterceptor {
    private Station station = new Station();

    public Station getProxyObject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(station.getClass());
        enhancer.setCallback(this);
        Station o = (Station) enhancer.create();
        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("经过代理！");
        Station result = (Station) methodProxy.invokeSuper(o,objects);
        return result;
    }
}
