package com.yinhai.myws.swzj;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SwzjWS {

    /**
     * 
     * @param bwlx �������� RSBCX001
     * @param bw ����
     * @return xml ��� 
     */
    @WebMethod
    public String RSB_CXXX (String bw);
    
}
