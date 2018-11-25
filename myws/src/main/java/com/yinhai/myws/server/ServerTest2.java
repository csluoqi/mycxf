package com.yinhai.myws.server;

import javax.xml.ws.Endpoint;

import com.yinhai.myws.impl.HelloWSImpl;

/**
 * 发布webservice 接口
 * @author lq
 *
 */
public class ServerTest2 {
	public static void main(String[] args) {
		String address = "http://127.0.0.1:18080/myws/hellows";
		Endpoint.publish( address, new HelloWSImpl());
		System.out.println("start serever");
	}
}

















