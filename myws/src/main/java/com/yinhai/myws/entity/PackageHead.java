package com.yinhai.myws.entity;

public class PackageHead {
                           //长度       说明                备注
    private String SJBBH;   //20  //数据包编号   
    private String DWDM;    //11  //单位代码    发送方单位代码。 人社部：30000000000
    private String DWMC;    //60 // 单位名称    发送单位的名称
    private String JLS;     // 6   记录数 每个数据包最多不超1条
    private String SCRQ;     // 14  生成日期    年月日时分秒 YYYYMMDDHH24MISS
   
    
    
    public PackageHead() {
        super();
        // TODO Auto-generated constructor stub
    }
    public PackageHead(String sJBBH, String dWDM, String dWMC, String jLS, String sCRQ) {
        super();
        SJBBH = sJBBH;
        DWDM = dWDM;
        DWMC = dWMC;
        JLS = jLS;
        SCRQ = sCRQ;
    }
    public String getSJBBH() {
        return SJBBH;
    }
    public void setSJBBH(String sJBBH) {
        SJBBH = sJBBH;
    }
    public String getDWDM() {
        return DWDM;
    }
    public void setDWDM(String dWDM) {
        DWDM = dWDM;
    }
    public String getDWMC() {
        return DWMC;
    }
    public void setDWMC(String dWMC) {
        DWMC = dWMC;
    }
    public String getJLS() {
        return JLS;
    }
    public void setJLS(String jLS) {
        JLS = jLS;
    }
    public String getSCRQ() {
        return SCRQ;
    }
    public void setSCRQ(String sCRQ) {
        SCRQ = sCRQ;
    }

    
    
}
