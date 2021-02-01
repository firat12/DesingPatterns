package com.firatcapin.desingpatterns.structural.composite.sonrasi;

import java.math.BigDecimal;

public class AppSonrasi {
    public static void main(String[] args) {
        System.out.println("******Sebze Paketi******");

        Urun domates = new Urun("domates", BigDecimal.TEN);
        Urun patates = new Urun("patates", BigDecimal.ONE);
        Urun sogan = new Urun("sogan", BigDecimal.ONE);

        Paket sebzePaketi = new Paket("Sebze Paketi");
        sebzePaketi.getUrunList().add(domates);
        sebzePaketi.getUrunList().add(patates);
        sebzePaketi.getUrunList().add(sogan);

        System.out.println("******Teknoloji Paketi******");

        Urun sesSistemi = new Urun("Ses Sistemi", BigDecimal.TEN);
        Urun kulaklik = new Urun("kulaklık", BigDecimal.ONE);

        Paket teknolojiPaketi = new Paket("Teknoloji Paketi");
        teknolojiPaketi.getUrunList().add(sesSistemi);
        teknolojiPaketi.getUrunList().add(kulaklik);

        Urun futbolTopu = new Urun("Futbol Topu", BigDecimal.ONE);

        Sepet sepet = new Sepet("Sepetim");
        sepet.getFiyatHesapla().add(sebzePaketi);
        sepet.getFiyatHesapla().add(teknolojiPaketi);
        sepet.getFiyatHesapla().add(futbolTopu);


        System.out.println("Toplam Tutar : " + sepet.toplamTutar());

        /**
         * Şimdi kumanya da ekliyorum ve spette hiç bir değişiklik yapmadan sepete ekliyorum
         */

        Kumanya kumanya = new Kumanya("Ramazan Kumanyası");
        Urun yag = new Urun("Yağ", BigDecimal.valueOf(100));
        kumanya.getUrunList().add(yag);
        kumanya.getPaketList().add(sebzePaketi);

        sepet.getFiyatHesapla().add(kumanya);
        System.out.println("Toplam Tutar : " + sepet.toplamTutar());

    }
}
