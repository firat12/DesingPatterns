package com.firatcapin.desingpatterns.behavioarol.template.yeni;

import com.firatcapin.desingpatterns.behavioarol.template.DevamsizlikDilekcesi;

import java.util.Date;

public class AnadoluLisesiYeniDilekce extends DevamsizlikDilekcesi {

    private String sinif;
    private String numara;
    private String isim;

    public AnadoluLisesiYeniDilekce(String sinif, String numara, String isim) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
    }

    @Override
    public Date getTarih() {
        return new Date();
    }

    @Override
    public String getKurumAdi() {
        return "Ankara Anadolu Lisesi";
    }

    @Override
    public String getSehir() {
        return "Ankara";
    }

    @Override
    public String getSinifAdi() {
        return sinif;
    }

    @Override
    public String getOkulNumarasi() {
        return numara;
    }

    @Override
    public String getOgrenimYili() {
        return "2021";
    }

    @Override
    public String getYariyil() {
        return "2";
    }

    @Override
    public String getOgrenciAdSoyad() {
        return isim;
    }
}
