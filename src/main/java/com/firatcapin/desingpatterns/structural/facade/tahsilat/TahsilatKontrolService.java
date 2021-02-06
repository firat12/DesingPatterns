package com.firatcapin.desingpatterns.structural.facade.tahsilat;

import com.firatcapin.desingpatterns.structural.facade.borc.Borc;
import com.firatcapin.desingpatterns.structural.facade.borc.BorcTuru;
import com.firatcapin.desingpatterns.structural.facade.hukuksal.HukukKontrolService;
import com.firatcapin.desingpatterns.structural.facade.yapilandirma.YapilandirmaKontrolService;

public class TahsilatKontrolService {
    private YapilandirmaKontrolService yapilandirmaKontrolService;
    private HukukKontrolService hukukKontrolService;

    public TahsilatKontrolService(){
        this.yapilandirmaKontrolService = new YapilandirmaKontrolService();
        this.hukukKontrolService = new HukukKontrolService();
    }

    public  boolean isTahsilatUygun(Borc borc) {
        boolean yapiladirmaBozulmali = false;

        if(BorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())){
            yapiladirmaBozulmali = yapilandirmaKontrolService.isYapilndirmaBozulmali(borc.getVadeTarihi());
        }

        boolean hukuksalIslemlde = hukukKontrolService.isHukuksalIslemde(borc.getId());

        boolean isBorcTahsilataUygun = !(yapiladirmaBozulmali || hukuksalIslemlde);

        return isBorcTahsilataUygun;
    }
}
