package com.yinhai.myws.server;

import javax.xml.ws.Endpoint;

import com.yinhai.myws.cxftest.impl.DataTypeWSImpl;
import com.yinhai.myws.impl.HelloWSImpl;

/**
 * ����webservice �ӿ�
 * @author lq
 *
 */
public class ServerTest3 {
	public static void main(String[] args) {
		String address = "http://127.0.0.1:18181/myws/datatypewsimpl";
		Endpoint.publish( address, new DataTypeWSImpl());
		System.out.println("start serever");
	}
}

















