package com.firatcapin.desingpatterns.structural.composite.sonrasi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private String ad;
    /** Bu sayede epette hiç bir değişikik yapmdan fiyat hesaplanabilir yaptık **/
    private List<FiyatHesapla> fiyatHesapla;

    public Sepet(String ad){
        this.ad = ad;
        this.fiyatHesapla = new ArrayList<>();
    }

    public BigDecimal toplamTutar(){
        BigDecimal toplamTutar = BigDecimal.ZERO;

        for(FiyatHesapla hesapla: fiyatHesapla){
            toplamTutar =  toplamTutar.add(hesapla.getFiyat());
        }

        return toplamTutar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<FiyatHesapla> getFiyatHesapla() {
        return fiyatHesapla;
    }

    public void setFiyatHesapla(List<FiyatHesapla> fiyatHesapla) {
        this.fiyatHesapla = fiyatHesapla;
    }
}
