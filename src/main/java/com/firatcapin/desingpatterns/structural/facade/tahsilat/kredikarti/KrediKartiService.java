package com.firatcapin.desingpatterns.structural.facade.tahsilat.kredikarti;

import com.firatcapin.desingpatterns.structural.facade.borc.OdemeBilgileri;

import java.math.BigDecimal;

public class KrediKartiService {
    private KrediKartiKontrolService krediKartiKontrolService;

    public KrediKartiService() {
        krediKartiKontrolService = new KrediKartiKontrolService();
    }

    public boolean krediKartindanTahsilDene(OdemeBilgileri odemeBilgileri, BigDecimal odenecekTutar){
        boolean krediKartiGecerli = krediKartiKontrolService.isKrediKartiGecerli(odemeBilgileri);

        if(!krediKartiGecerli){
            return false;
        }

        boolean yeterliLimirVar = isYeterliLimitVar(odemeBilgileri, odenecekTutar);

        if (!yeterliLimirVar){
            return false;
        }

        System.out.println("Kredi kartından " + odenecekTutar + " Tl tahsil edilmiştir.");

        return true;
    }

    private boolean isYeterliLimitVar(OdemeBilgileri odemeBilgileri, BigDecimal odenecekTutar) {
        BigDecimal limit = getKrediKartiLimiti(odemeBilgileri);

        boolean isYeterliLimitVar = limit.compareTo(odenecekTutar) > 0;

        if(!isYeterliLimitVar){
            System.out.println("Kartta Yeterli limit bulunmamaktadır");
        }

        return isYeterliLimitVar;
    }

    private BigDecimal getKrediKartiLimiti(OdemeBilgileri odemeBilgileri) {
        BigDecimal limit = BigDecimal.ZERO;

        String kartUzerindekiIsim = odemeBilgileri.getKartUzerindekiIsim();

        if(kartUzerindekiIsim.contains("Bahadır")){
            limit = new BigDecimal(100);
        }else if(kartUzerindekiIsim.contains("Ayşe")) {
            limit = new BigDecimal(1000);
        }else  if(kartUzerindekiIsim.contains("Yusuf")){
            limit = BigDecimal.TEN;
        }

        return limit;
    }
}
