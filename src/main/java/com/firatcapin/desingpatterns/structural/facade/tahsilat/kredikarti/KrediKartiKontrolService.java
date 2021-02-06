package com.firatcapin.desingpatterns.structural.facade.tahsilat.kredikarti;

import com.firatcapin.desingpatterns.structural.facade.borc.OdemeBilgileri;
import com.firatcapin.desingpatterns.structural.facade.util.DateUtil;

import java.util.Date;

public class KrediKartiKontrolService {

    public boolean isKrediKartiGecerli(OdemeBilgileri odemeBilgileri){
        Long sonKullanmaAy = odemeBilgileri.getAy();
        Long sonKullanmaYil = odemeBilgileri.getYil();

        Date bugun = DateUtil.getGununTarihi();

        Long gununAyi = DateUtil.tarihinAyi(bugun);
        Long gununYili = DateUtil.tarihinYili(bugun);

        boolean isKrediKartiGecerli = false;

        if(sonKullanmaYil.compareTo(gununYili) > 0){
            isKrediKartiGecerli = true;
        } else if(sonKullanmaYil.compareTo(gununYili)  == 0){
            if(sonKullanmaAy.compareTo(gununAyi) > 0){
                isKrediKartiGecerli = true;
            }
        }

        if(!isKrediKartiGecerli){
            System.out.println("Geçersiz kredi kartı bilgileri!");
        }

        return isKrediKartiGecerli;
    }
}
