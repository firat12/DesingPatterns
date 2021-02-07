package com.firatcapin.desingpatterns.behavioarol.iterator.iteratoryeni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kitap {
    private String ad;
    private List<Soru> sorular;

    public Kitap(String ad) {
        this.ad = ad;
        this.sorular = new ArrayList<>();
        sorular.add(new Soru(1L));
        sorular.add(new Soru(2L));
        sorular.add(new Soru(3L));
        sorular.add(new Soru(4L));
        sorular.add(new Soru(5L));
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    // Soru list yapısını iterator olarka değiştiriyoruz.
    public Iterator getSorular() {
        return sorular.iterator();
    }

    public void setSoruList(List<Soru> soruList) {
        this.sorular = soruList;
    }
}
