package com.firatcapin.desingpatterns.behavioarol.strategy;

public class AppStrategy {
    public static void main(String[] args) {
        Ogrenci sayisalOgrenci = new Ogrenci(EnumBolum.SAYISAL);
        Ogrenci sozelOgrenci = new Ogrenci(EnumBolum.SOZEL);
        Ogrenci esitagirlikOgrenci = new Ogrenci(EnumBolum.ES);

        String sayisalOncelikSirasi = sayisalOgrenci.getOncelikSirasi();
        String sozelOncelikSirasi = sozelOgrenci.getOncelikSirasi();
        String eaOncelikSirasi = esitagirlikOgrenci.getOncelikSirasi();

        baslat(sayisalOncelikSirasi);
        baslat(sozelOncelikSirasi);
        baslat(eaOncelikSirasi);
    }

    private static void baslat(String sayisalOncelikSirasi) {
        System.out.println(sayisalOncelikSirasi);
    }
}
