package com.firatcapin.desingpatterns.structural.composite.sonrasi;

import java.math.BigDecimal;
import java.util.List;

public class HesaplamaUtil {

    public static BigDecimal urunToplamFiyati(List<Urun> urunList){
        BigDecimal toplamTutar = BigDecimal.ZERO;
        for(Urun urun : urunList){
            toplamTutar = toplamTutar.add(toplamTutar);
        }
        return toplamTutar;
    }

    public static BigDecimal paketToplamFiyati(List<Paket> paketList){
        BigDecimal toplamTutar = BigDecimal.ZERO;
        for(Paket paket : paketList){
            toplamTutar = toplamTutar.add(paket.getFiyat());
        }
        return toplamTutar;
    }

}
