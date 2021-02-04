package com.firatcapin.desingpatterns.structural.proxy;

import java.math.BigDecimal;

public class YoneticiProxy implements SirketBilgileri {
    /**
     * Bu clasın macı gercekYonetici classa vekilllik yapmak için oluşturuldu. Asıl gerçek yonetcinin yapacağı işlem
     * yapılmadan önce bir yetki kontrolü yaptığımızı düşünelim.
     */
    private GercekYonetici gercekYonetici;

    private String kullaniciAdi;
    private String sifre;

    public YoneticiProxy(String kullaniciAdi, String sifre){
        this.gercekYonetici = new GercekYonetici();
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    private boolean isKullaniciYonetici(){
        boolean isKullaniciYonetici = false;
        boolean kullaniciValid = CalisanUtil.isKullaniciValid(kullaniciAdi, sifre);
        if(kullaniciValid){
            Calisan calisan = CalisanUtil.getCalisanKullaniciAdi(kullaniciAdi);
            isKullaniciYonetici = calisan.isYonetici();
        }
        return isKullaniciYonetici;
    }


    @Override
    public BigDecimal getCiro() throws IllegalAccessException{
        boolean kullaniciYonetici = isKullaniciYonetici();
        if (kullaniciYonetici) {
            return gercekYonetici.getCiro();
        } else {
            throw new IllegalAccessException();
        }

    }
}
