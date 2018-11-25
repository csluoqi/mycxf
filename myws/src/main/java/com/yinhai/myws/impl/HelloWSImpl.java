package com.yinhai.myws.impl;

 
import javax.jws.WebService;

import com.yinhai.myws.HelloWS;

@WebService
public class HelloWSImpl implements HelloWS {
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String result = "Hello " + name;
		System.out.println(result);
		return result;
	}

 
}
