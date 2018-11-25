package test.mycxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

/**
 * @author lq
 * 创建时间 2018/11/18 22:32
 **/
public class CxfClientTest {
    public static void main(String[] args) throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        //wsdl地址
        Client client = dcf.createClient("http://127.0.0.1:8080/mycxf/orderWS?wsdl");
        HTTPConduit http = (HTTPConduit) client.getConduit();
        client.getOutInterceptors().add(new AddUserClientInterceptor("xfzhang","123456"));
        //设置连接超时参数
        HTTPClientPolicy hcp = new HTTPClientPolicy();
        hcp.setConnectionTimeout(2000);
        hcp.setReceiveTimeout(200000);
        http.setClient(hcp);

        //设置报文头信息
        //client.getOutInterceptors().add(new AddSoapHeader(paramMap));
        //发起调用
        Object[] obj = client.invoke("getOrderById",1);
        //获取返回结果(XML格式)
        Object result = obj[0];
        System.out.println(result);
    }
}
