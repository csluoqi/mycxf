package com.yinhai.myws.server;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;

import com.yinhai.myws.cxftest.impl.DataTypeWSImpl;
import com.yinhai.myws.impl.HelloWSImpl;

/**
 * ����webservice �ӿ�
 * @author lq
 *
 */
public class ServerTest {
	public static void main(String[] args) {
		String address = "http://127.0.0.1:18181/myws/datatypewsimpl";
		Endpoint endpoint = Endpoint.publish( address, new DataTypeWSImpl());
		EndpointImpl endpointImpl = (EndpointImpl)endpoint;
		//��־��������
		List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		
		//��־��������
        List<Interceptor<? extends Message>> outInterceptors = endpointImpl.getOutInterceptors();
        outInterceptors.add(new LoggingOutInterceptor());		
		System.out.println("start serever");
	}
}

















