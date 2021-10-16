package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class ProfileAspect {


    @Around("@annotation(com.demo.aop.Profiler)")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long time = System.nanoTime();
        Object res =  pjp.proceed();
        time = System.nanoTime() - time;
        System.out.println("It takse " + time + "ns");
        return res;
    }


}