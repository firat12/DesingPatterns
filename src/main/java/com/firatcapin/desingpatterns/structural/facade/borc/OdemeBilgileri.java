package com.firatcapin.desingpatterns.structural.facade.borc;

public class OdemeBilgileri {
    private String kartUzerindekiIsim;
    private String kartNumarasi;
    private Long ay;
    private Long yil;
    private Long cvvNo;

    public OdemeBilgileri(String kartUzerindekiIsim, String kartNumarasi, Long ay, Long yil, Long cvvNo) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
        this.kartNumarasi = kartNumarasi;
        this.ay = ay;
        this.yil = yil;
        this.cvvNo = cvvNo;
    }

    public String getKartUzerindekiIsim() {
        return kartUzerindekiIsim;
    }

    public String getKartNumarasi() {
        return kartNumarasi;
    }

    public Long getAy() {
        return ay;
    }

    public Long getYil() {
        return yil;
    }

    public Long getCvvNo() {
        return cvvNo;
    }
}
