package com.firatcapin.desingpatterns.structural.composite.sonrasi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements FiyatHesapla{
    private String ad;
    private List<Urun> urunList;

    public Paket(String ad) {
        this.ad = ad;
        this.urunList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        return HesaplamaUtil.urunToplamFiyati(urunList);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }
}
