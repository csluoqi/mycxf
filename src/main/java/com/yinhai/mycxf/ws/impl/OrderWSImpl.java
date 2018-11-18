package com.yinhai.mycxf.ws.impl;

import javax.jws.WebService;

import com.yinhai.mycxf.bean.Order;
import com.yinhai.mycxf.ws.OrderWS;

@WebService
public class OrderWSImpl implements OrderWS{

    public OrderWSImpl() {
        System.out.println("init constructor");
    }
    
    @Override
    public Order getOrderById(int id) {
        System.out.println("server getorderbyid"+id);
        return new Order(id,"beer",1221.2);
    }

}
