package com.demo;

public class SaleService implements Service{


    @Override
    public void func(){
        System.out.println("func--------------------------");
    }

    @Override
    public void sell(){
        System.out.println("selling-----------------------");
    }

    public void func2(){
        System.out.println("func2-------------------------");
    }

}
