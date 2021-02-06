package com.firatcapin.desingpatterns.structural.facade;

import com.firatcapin.desingpatterns.structural.facade.borc.Borc;
import com.firatcapin.desingpatterns.structural.facade.borc.OdemeBilgileri;
import com.firatcapin.desingpatterns.structural.facade.gecikme.GecikmeZammiHesaplamaServis;
import com.firatcapin.desingpatterns.structural.facade.tahsilat.TahsilatKontrolService;
import com.firatcapin.desingpatterns.structural.facade.tahsilat.kredikarti.KrediKartiService;

import java.math.BigDecimal;

public class TahsilatFacade {

    // Burada ki işin özü istediğin gibi herşeyi kullan ama dışarıya tek bir metod aç.

    private GecikmeZammiHesaplamaServis gecikmeZammiHesaplamaServis;
    private TahsilatKontrolService tahsilatKontrolService;
    private KrediKartiService krediKartiService;

    public TahsilatFacade() {
        gecikmeZammiHesaplamaServis  = new GecikmeZammiHesaplamaServis();
        tahsilatKontrolService = new TahsilatKontrolService();
        krediKartiService = new KrediKartiService();
    }

    public boolean tahsilatYap(Borc borc, OdemeBilgileri odemeBilgileri){
        boolean tahsilatUygun = tahsilatKontrolService.isTahsilatUygun(borc);

        if(!tahsilatUygun){
            return  false;
        }

        BigDecimal borcTutari = borc.getBorcTutarı();

        BigDecimal gecikmeZammi = gecikmeZammiHesaplamaServis.gecikmeZammiHesapla(borcTutari, borc.getVadeTarihi());

        BigDecimal odenecekTutar = borcTutari.add(gecikmeZammi);

        System.out.println("ilgi : kredi kartından " + odemeBilgileri + " Tl tahsilat deneniyor");

        boolean isSuccess = krediKartiService.krediKartindanTahsilDene(odemeBilgileri, odenecekTutar);

        return isSuccess;
    }

}
