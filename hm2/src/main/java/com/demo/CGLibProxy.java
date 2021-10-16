package com.demo;

import net.sf.cglib.proxy.*;
import sun.invoke.empty.Empty;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    private Object target;



    public Object getInstance(Object o) {
        this.target = o;
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(Empty);

        CallbackFilter filter = new CallBackFilterImp();

        enhancer.setCallbackFilter(filter);
        return enhancer.create();



    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Before Sell--------------CGLIB Proxy");

        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("After Sell--------------CGLIB Proxy");
        return res;
    }

    private static class CallBackFilterImp implements CallbackFilter {

        @Override
        public int accept(Method method) {
            if (method.getName().equals("sell"))

                // -----------!important----------------------------
                // there is a Problem
                // i don`t know how to use enhancer.setCallBackTypes();
                // so the length of callBackTypes is always zero
                // then the accept func can`t work
                // -------------------------------------------------
                return 1;
            return 0;
        }
    }

}
