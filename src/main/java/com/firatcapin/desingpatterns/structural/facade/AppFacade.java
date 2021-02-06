package com.firatcapin.desingpatterns.structural.facade;

import com.firatcapin.desingpatterns.structural.facade.borc.Borc;
import com.firatcapin.desingpatterns.structural.facade.borc.BorcTuru;
import com.firatcapin.desingpatterns.structural.facade.borc.OdemeBilgileri;
import com.firatcapin.desingpatterns.structural.facade.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class AppFacade {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan sadece kart bilgileri ve odenecek tutarı alıyoruz diğer tüm işleri arkda tarafta tek bir nesne içerisnde kotrol ettriyoruz.
         */
        TahsilatFacade tahsilatFacade = new TahsilatFacade();

        Date vadeTarihi = DateUtil.tarihOlustur("01.01.2025");

        Borc borc = new Borc(0L, BorcTuru.NORMAL, new BigDecimal(100), vadeTarihi);

        OdemeBilgileri odemeBilgileri = new OdemeBilgileri("Fırat Çapın", "12356", 01L, 2023L,123l);

        boolean isSuccess = tahsilatFacade.tahsilatYap(borc, odemeBilgileri);

        if(isSuccess){
            System.out.println("Tahsilat Yapıldı");
        }else{
            System.out.println("Tahsilat Yapılamadı");
        }
    }
}
