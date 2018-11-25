package com.yinhai.myws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SEI
 * @author lq
 *
 */
@WebService
public interface HelloWS {
    @WebMethod
	public String sayHello(String name);
}















