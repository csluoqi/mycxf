package com.yinhai.myws.entity;

public class PackageHead {
                           //����       ˵��                ��ע
    private String SJBBH;   //20  //���ݰ����   
    private String DWDM;    //11  //��λ����    ���ͷ���λ���롣 ���粿��30000000000
    private String DWMC;    //60 // ��λ����    ���͵�λ������
    private String JLS;     // 6   ��¼�� ÿ�����ݰ���಻��1��
    private String SCRQ;     // 14  ��������    ������ʱ���� YYYYMMDDHH24MISS
   
    
    
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
