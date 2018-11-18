package test.mycxf.client;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.org.apache.xml.internal.utils.DOMHelper;



/**
 * ������ʵ���û���������
 * @author lq
 *
 */
public class AddUserClientInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String name;
    private String password;

    public AddUserClientInterceptor(String name, String password) {
        super(Phase.PRE_PROTOCOL);//ǰ������
        this.name = name;
        this.password = password;
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
        // TODO Auto-generated method stub
           List<Header> headers = msg.getHeaders();
           
           Document document = DOMHelper.createDocument();
           Element rootElement = document.createElement("atguigu");
           Element nameElement = document.createElement("name");
           nameElement.setTextContent(this.name);
           rootElement.appendChild(nameElement);

           Element passwordElement = document.createElement("password");
           passwordElement.setTextContent(this.password);
           rootElement.appendChild(passwordElement);
           headers.add(new Header(new QName("atguigu"),rootElement));
           System.out.println("handle");
    }

}
