package com.firatcapin.desingpatterns.structural.composite.once;

import java.math.BigDecimal;

public class AppOncesi {
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
        sepet.getPaketList().add(sebzePaketi);
        sepet.getPaketList().add(teknolojiPaketi);
        sepet.getUrunList().add(futbolTopu);

        BigDecimal toplamTutar = sepet.toplamTutar();

        System.out.println("Toplam Tutar : " + toplamTutar);

        /**
         * Buraya kadar olan kısımda tasarımsal bir hata var.
         * Örneğin kumanya a olabilir. Ve sepetin içine kumanya da dahil etmek gerekecek.
         * Kumanya clasını eklemek iin gidps epetin içinde değişiklik yapmak gerekyor. Open /Closed prensibine aykırı olmuş oluyor
         * Bir nesne veya metod geliştirilebilir ama değiştirilemez.
         * Sepetin içine giip  toplam tutar alanına kumanyayıda dahil etmek gerekecek bu bir tasarımsal hatadır.
         */
    }
}
