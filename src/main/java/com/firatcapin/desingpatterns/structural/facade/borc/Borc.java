package com.firatcapin.desingpatterns.structural.facade.borc;

import java.math.BigDecimal;
import java.util.Date;

public class Borc {
    private Long id;
    private BorcTuru borcTuru;
    private BigDecimal borcTutarı;
    private Date vadeTarihi;

    public Borc() {
    }

    public Borc(Long id, BorcTuru borcTuru, BigDecimal borcTutarı, Date vadeTarihi) {
        this.id = id;
        this.borcTuru = borcTuru;
        this.borcTutarı = borcTutarı;
        this.vadeTarihi = vadeTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BorcTuru getBorcTuru() {
        return borcTuru;
    }

    public void setBorcTuru(BorcTuru borcTuru) {
        this.borcTuru = borcTuru;
    }

    public BigDecimal getBorcTutarı() {
        return borcTutarı;
    }

    public void setBorcTutarı(BigDecimal borcTutarı) {
        this.borcTutarı = borcTutarı;
    }

    public Date getVadeTarihi() {
        return vadeTarihi;
    }

    public void setVadeTarihi(Date vadeTarihi) {
        this.vadeTarihi = vadeTarihi;
    }
}
