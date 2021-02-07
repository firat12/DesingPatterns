package com.firatcapin.desingpatterns.behavioarol.mediator;

import java.math.BigDecimal;

public abstract class Uretici {

    private String ad;
    private BigDecimal urunFiyati;
    private EnumUrun urun;

    // Aracı Mediator
    private AraciMediator araciMediator;

    public Uretici(String ad, BigDecimal urunFiyati, EnumUrun urun, AraciMediator araciMediator) {
        this.ad = ad;
        this.urunFiyati = urunFiyati;
        this.urun = urun;
        this.araciMediator = araciMediator;
    }


    // Burdaki işlem; Üretici ürünü satıyor ama kime araci yani komisyoncuya. komisyonuda üreticidenAl metodunu çağırıyoruz.
    public void urunSat(){
        araciMediator.ureticidenAl(this);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public BigDecimal getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(BigDecimal urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public void setUrun(EnumUrun urun) {
        this.urun = urun;
    }
}
