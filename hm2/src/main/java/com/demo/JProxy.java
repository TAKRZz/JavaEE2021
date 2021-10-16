package com.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JProxy implements InvocationHandler {
    // JDK Proxy
    private Object target;

    public JProxy(Object o) {
        this.target = o;
    }

    public Object getInstance() {
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Select the Particular Method "sell"
        if (method.getName() == "sell")
            System.out.println("Before JDK Proxy-----------");

        Object res = method.invoke(target, args);
        if (method.getName() == "sell")
            System.out.println("After  JDK Proxy-----------");

        return res;
    }
}
