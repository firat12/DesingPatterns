package com.firatcapin.desingpatterns.structural.facade.yapilandirma;

import com.firatcapin.desingpatterns.structural.facade.util.DateUtil;

import java.util.Date;

public class YapilandirmaKontrolService {
    /**
     * Eğer vade arihi üzerinden 90 gun geçtiyse yapılandırma bozulur.
     * @param vadeTarihi
     * @return
     */
    public boolean isYapilndirmaBozulmali(Date  vadeTarihi){
        Date bugun = DateUtil.getGununTarihi();
        long gunFrk = DateUtil.gunFarkHesapla(vadeTarihi, bugun);
        boolean isYapilandirmaBozulmali = gunFrk > 90;

        if(isYapilandirmaBozulmali){
            System.out.println("Borcun yapılandırması bozulmalı! Tahsil edilemez!");
        }

        return isYapilandirmaBozulmali;
    }
}
