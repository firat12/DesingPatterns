package com.firatcapin.desingpatterns.behavioarol.mediator;

import java.math.BigDecimal;

public abstract class Pazarci {
    private String adi;
    private EnumUrun urun;
    private BigDecimal fiyat;

    private AraciMediator araciMediator;

    public Pazarci(String adi, EnumUrun urun, BigDecimal fiyat, AraciMediator araciMediator) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araciMediator = araciMediator;
    }

    // Burdaki işlem; Pazarci ürünü alıyor ama aracidan alıyor. Araci da pazarciyaSat metodunu çağırıyor.
    public void urunAl(){
        araciMediator.pazarciyaSat(this);
    }
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public void setUrun(EnumUrun urun) {
        this.urun = urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }
}
