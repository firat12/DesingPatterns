package com.firatcapin.desingpatterns.structural.facade.gecikme;

import com.firatcapin.desingpatterns.structural.facade.db.GecikmeZammOranEntityService;
import com.firatcapin.desingpatterns.structural.facade.util.DateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class GecikmeZammiHesaplamaServis {

    private GecikmeZammOranEntityService gecikmeZammOranEntity;

    public GecikmeZammiHesaplamaServis() {
        this.gecikmeZammOranEntity = new GecikmeZammOranEntityService();
    }

    public BigDecimal gecikmeZammiHesapla(BigDecimal tutar, Date vadeTarihi){
        BigDecimal gecikmeZammi = BigDecimal.ZERO;
        if(vadeTarihi.compareTo(new Date()) > 0){
            return gecikmeZammi;
        }

        gecikmeZammi = gecikmeZamminiHesapla(tutar,vadeTarihi);
        return gecikmeZammi;
    }

    public BigDecimal gecikmeZamminiHesapla(BigDecimal tutar, Date vadeTarihi){
        BigDecimal gecikmeZammiOrani = gecikmeZammOranEntity.getGecikmeZammiOran();

        Date gununTarihi = DateUtil.getGununTarihi();
        long gunFarki = DateUtil.gunFarkHesapla(gununTarihi, vadeTarihi);
        BigDecimal fark = BigDecimal.valueOf(gunFarki);
        BigDecimal gecikmeZammi = gecikmeZammiOrani.multiply(fark).multiply(tutar);
        gecikmeZammi = gecikmeZammi.setScale(2, RoundingMode.HALF_DOWN);

        if (gecikmeZammi.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Bilgi : Gecikme zammi hesaplandi. Gecikme Zammı Tutarı: " + gecikmeZammi);
        }

        return gecikmeZammi;
    }
}
