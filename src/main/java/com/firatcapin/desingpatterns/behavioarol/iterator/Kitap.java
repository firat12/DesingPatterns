package com.firatcapin.desingpatterns.behavioarol.iterator;

import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String ad;
    private List<Soru> soruList;

    public Kitap(String ad) {
        this.ad = ad;
        this.soruList = new ArrayList<>();
        soruList.add(new Soru(1L));
        soruList.add(new Soru(2L));
        soruList.add(new Soru(3L));
        soruList.add(new Soru(4L));
        soruList.add(new Soru(5L));
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Soru> getSoruList() {
        return soruList;
    }

    public void setSoruList(List<Soru> soruList) {
        this.soruList = soruList;
    }
}
