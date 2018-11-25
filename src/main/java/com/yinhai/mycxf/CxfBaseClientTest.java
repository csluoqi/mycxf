package com.yinhai.mycxf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinhai.mycxf.bean.Order;
import com.yinhai.mycxf.ws.OrderWS;

public class CxfBaseClientTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		OrderWS orderWS = (OrderWS) context.getBean("orderClient");
		Order order = orderWS.getOrderById(2012);
		System.out.println(order);
	}
}
