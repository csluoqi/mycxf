package com.yinhai.myws.swzj.impl;

import java.nio.charset.Charset;

import javax.jws.WebService;

import com.yinhai.myws.swzj.SwzjWS;

@WebService
public class SwzjWSImpl implements SwzjWS{

    @Override
    public String RSB_CXXX(String bw) {
        // 1.�ж�����
       //System.out.println("bwlx"+bwlx);
        System.out.println("bw"+bw);
//        System.out.println("1--2"+bw);
//        if(!"RSBCX001".equals(bwlx)){
//                
//        return "";
//        
//            }
        //2.��ѯ���ݿ���װ�����
        String result = "\n<?xml version=\"1.0\" encoding=\"GBK\"?>\r\n" + 
                "<Package>\r\n" + 
                "    <PackageHead>\r\n" + 
                "        <SJBBH>30000020180905000001</SJBBH>\r\n" + 
                "        <DWDM>30000000000</DWDM>\r\n" + 
                "        <DWMC>���粿</DWMC>\r\n" + 
                "        <JLS>1</JLS>\r\n" + 
                "        <SCRQ>20180905195031</SCRQ>\r\n" + 
                "    </PackageHead>\r\n" + 
                "    <Data>\r\n" + 
                "        <Record index=\"1\">\r\n" + 
                "            <XM_C>�⼮��Ա���������ģ�</XM_C>\r\n" + 
                "            <XM_E>�⼮��Ա������Ӣ�ģ�</XM_E>\r\n" + 
                "            <GZXKLB>����������</GZXKLB>\r\n" + 
                "            <GZXKBH>������ɱ��</GZXKBH>\r\n" + 
                "            <XB>�Ա�</XB>\r\n" + 
                "            <GJ>����</GJ>\r\n" + 
                "            <JYDWMC>��ҵ��λ����</JYDWMC>\r\n" + 
                "            <JYDWSHXYDM>��ҵ��λ������ô���</JYDWSHXYDM>\r\n" + 
                "            <JYDWZZJG>��ҵ��λӪҵִ�պ������֯��������֤����</JYDWZZJG>\r\n" + 
                "            <JYXKYXQ>��ҵ�����Ч��</JYXKYXQ>\r\n" + 
                "        </Record>\r\n" + 
                "    <Data>  \r\n" + 
                "<Package>\r\n" + 
                "";

        //��������
    
        //����
         return result;   
       // return new String(result.getBytes(Charset.forName("UTF-8")),Charset.forName("GBK"));
    }
    
    void cx001(){
        String str = "<?xml version=\"1.0\" encoding=\"GBK\"?>\r\n" + 
                "<Package>\r\n" + 
                "    <PackageHead>\r\n" + 
                "        <SJBBH>00000020180905000001</SJBBH>\r\n" + 
                "        <SJBLX>RSBCX001</SJBLX>\r\n" + 
                "        <DWDM>00000000000</DWDM>\r\n" + 
                "        <DWMC>����˰���ܾ�</DWMC>\r\n" + 
                "        <JLS>1</JLS>\r\n" + 
                "        <SCRQ>20180905195031</SCRQ>\r\n" + 
                "    </PackageHead>\r\n" + 
                "    <Data>\r\n" + 
                "        <Record index=\"1\">\r\n" + 
                "            <GZXKBH>123456789</GZXKBH>\r\n" + 
                "        </Record>\r\n" + 
                "    <Data>  \r\n" + 
                "<Package>   \r\n" + 
                "";
        
    }

     
}
