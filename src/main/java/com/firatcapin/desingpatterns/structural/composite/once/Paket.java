package com.firatcapin.desingpatterns.structural.composite.once;

import java.util.ArrayList;
import java.util.List;

public class Paket {
    private String ad;
    private List<Urun> urunList;

    public Paket(String ad) {
        this.ad = ad;
        this.urunList = new ArrayList<>();
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
