package com.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SellProxy implements Service{
    private SaleService saleService;

    public SellProxy(){
        saleService = new SaleService();
    }

    @Override
    public void func(){
        System.out.println("Before func-------------byProxy");
        saleService.func();
        System.out.println("After  func-------------byProxy");
    }
    @Override
    public void sell(){
        System.out.println("Before Selling----------byProxy");
        saleService.sell();
        System.out.println("After  Selling----------byProxy");
    }


}
