package com.yinhai.myws.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.sun.org.apache.xml.internal.utils.DOMHelper;

/**
 * 拦截器实现用户名和密码
 * @author lq
 *
 */
public class CheckUserClientInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
 

    public CheckUserClientInterceptor() {
        super(Phase.PRE_PROTOCOL);//前拦截器
 
    }

    /**
<atguigu>
    <name>xfzhang</name>
    <paddword>123456</paddword>
</atguigu>
     */
    @SuppressWarnings("deprecation")
    @Override
    public void handleMessage(SoapMessage msg) throws Fault {
       Header header = msg.getHeader(new QName("atguigu"));

       if(header!=null) {
           Element atguiguElement = (Element) header.getObject();
           String name = atguiguElement.getElementsByTagName("name").item(0).getTextContent();
           String password = atguiguElement.getElementsByTagName("password").item(0).getTextContent();
           if("xfzhang".equals(name) && "123456".equals(password)) {
               System.out.println("通过拦截器");
               return;
           }
       }
       //不通过
       throw new Fault(new RuntimeException("请传入一个正确的用户名和密码"));
    }

}
