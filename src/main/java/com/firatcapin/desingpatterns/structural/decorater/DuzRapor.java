package com.firatcapin.desingpatterns.structural.decorater;

public class DuzRapor implements Rapor {
    private String metin;

    public DuzRapor(String metin) {
        this.metin = metin;
    }

    @Override
    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }
}
