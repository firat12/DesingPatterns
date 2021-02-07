package com.firatcapin.desingpatterns.behavioarol.observer;

import java.math.BigDecimal;

public class TermemetreObserver extends Observable {

    private BigDecimal anlikSıcaklik;
    private BigDecimal maxSıcaklik;
    private BigDecimal minSıcaklik;

    public TermemetreObserver(BigDecimal maxSıcaklik, BigDecimal minSıcaklik) {
        this.anlikSıcaklik = BigDecimal.valueOf(24);
        this.maxSıcaklik = maxSıcaklik;
        this.minSıcaklik = minSıcaklik;

        sicakligiKontrolEt();
    }

    public BigDecimal getAnlikSıcaklik() {
        return anlikSıcaklik;
    }

    public void setAnlikSıcaklik(BigDecimal anlikSıcaklik) {
        this.anlikSıcaklik = anlikSıcaklik;
    }

    private void sicakligiKontrolEt(){
        boolean isCokSicak = anlikSıcaklik.compareTo(maxSıcaklik) >= 0;
        boolean isCokSoguk = anlikSıcaklik.compareTo(minSıcaklik) <= 0;

        if(isCokSicak || isCokSoguk){
            haberVer();
        }
    }
}
