package com.firatcapin.desingpatterns.structural.composite.once;

import java.util.ArrayList;
import java.util.List;

public class Kumanya {
    private String ad;
    private List<Urun> urunList;
    private List<Paket> paketList;

    public Kumanya(String ad){
        this.ad = ad;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
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

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
