package com.yinhai.myws.swzj;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SwzjWS {

    /**
     * 
     * @param bwlx 报文类型 RSBCX001
     * @param bw 报文
     * @return xml 结果 
     */
    @WebMethod
    public String RSB_CXXX (String bw);
    
}
