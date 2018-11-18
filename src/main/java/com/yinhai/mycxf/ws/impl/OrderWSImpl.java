package com.yinhai.mycxf.ws.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.yinhai.mycxf.bean.Order;
import com.yinhai.mycxf.ws.OrderWS;

@WebService(endpointInterface = "com.yinhai.mycxf.ws.OrderWS",
targetNamespace = "http://ws.mycxf.yinhai.com/",
serviceName="orderWS") 
@Component("orderWS")
public class OrderWSImpl implements OrderWS{

    public OrderWSImpl() {
//    	在项目启动时被初始化
        System.out.println("init constructor");
    }
    
    @Override
    public Order getOrderById(int id) {
        System.out.println("server getorderbyid"+id);
        return new Order(id,"beer",1221.2);
    }

}
