package com.demo.aop;


public class Test {

    private int num;
    @Profiler
    public void func1() {
        System.out.println("Func1 from Test---------------");
        int a = 0;
        for (int i = 0; i < 100; i++) {
            a += i;
        }
    }

    public void func2() {
        System.out.println("Func2 from Test---------------");
        int a = 0;
        for (int i = 0; i < 1000; i++) {
            a += i;
            a *= i;
            a *= i;
        }
        num = a;
        System.out.println(num);
        System.out.println("Func2 from Test---------------");

//        System.out.println(a);
    }

    public void func3() {
        System.out.println("Func3 from Test---------------");
        int a = 0;
        for (int i = 0; i < 100; i++) {
            a += i;
        }
        num = a;
    }


    @Profiler
    public void func4() {

        System.out.println("Func4 from Test---------------");

        int temp = 10;
        for(int i = 1;i<50;i++){
            temp+=i;
            temp *= i;
        }
        System.out.println("temp = " + temp);
        System.out.println("Func4 from Test---------------");

    }


}
