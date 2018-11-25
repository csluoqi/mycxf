package com.yinhai.myws.swzj.impl;

import java.nio.charset.Charset;

import javax.jws.WebService;

import com.yinhai.myws.swzj.SwzjWS;

@WebService
public class SwzjWSImpl implements SwzjWS{

    @Override
    public String RSB_CXXX(String bw) {
        // 1.判断类型
       //System.out.println("bwlx"+bwlx);
        System.out.println("bw"+bw);
//        System.out.println("1--2"+bw);
//        if(!"RSBCX001".equals(bwlx)){
//                
//        return "";
//        
//            }
        //2.查询数据库组装结果集
        String result = "\n<?xml version=\"1.0\" encoding=\"GBK\"?>\r\n" + 
                "<Package>\r\n" + 
                "    <PackageHead>\r\n" + 
                "        <SJBBH>30000020180905000001</SJBBH>\r\n" + 
                "        <DWDM>30000000000</DWDM>\r\n" + 
                "        <DWMC>人社部</DWMC>\r\n" + 
                "        <JLS>1</JLS>\r\n" + 
                "        <SCRQ>20180905195031</SCRQ>\r\n" + 
                "    </PackageHead>\r\n" + 
                "    <Data>\r\n" + 
                "        <Record index=\"1\">\r\n" + 
                "            <XM_C>外籍人员姓名（中文）</XM_C>\r\n" + 
                "            <XM_E>外籍人员姓名（英文）</XM_E>\r\n" + 
                "            <GZXKLB>工作许可类别</GZXKLB>\r\n" + 
                "            <GZXKBH>工作许可编号</GZXKBH>\r\n" + 
                "            <XB>性别</XB>\r\n" + 
                "            <GJ>国籍</GJ>\r\n" + 
                "            <JYDWMC>就业单位名称</JYDWMC>\r\n" + 
                "            <JYDWSHXYDM>就业单位社会信用代码</JYDWSHXYDM>\r\n" + 
                "            <JYDWZZJG>就业单位营业执照号码或组织机构代码证号码</JYDWZZJG>\r\n" + 
                "            <JYXKYXQ>就业许可有效期</JYXKYXQ>\r\n" + 
                "        </Record>\r\n" + 
                "    <Data>  \r\n" + 
                "<Package>\r\n" + 
                "";

        //解析参数
    
        //返回
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
                "        <DWMC>国家税务总局</DWMC>\r\n" + 
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
