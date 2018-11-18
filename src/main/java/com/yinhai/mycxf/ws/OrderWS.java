package com.yinhai.mycxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.yinhai.mycxf.bean.Order;

@WebService
public interface OrderWS {
    
    @WebMethod
    public Order getOrderById(int id);
    

}
