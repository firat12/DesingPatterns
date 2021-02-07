package com.firatcapin.desingpatterns.behavioarol.command;

import java.math.BigDecimal;

public class AppCommand {

    public static void main(String[] args) {
        // Hesap makinessi1 ile yapılan çalışma design pattern uygulanmamıış halidir.
        // Hesap makinesi işlem metodunda tüm işlem türülerini if else ye göre işlem yaptırıyoruz.
        BigDecimal sonucToplam = HesapMakinesi1.islem(IslemTuru.TOPLAMA, BigDecimal.TEN,BigDecimal.ONE);
        BigDecimal sonucFark = HesapMakinesi1.islem(IslemTuru.CIKARMA, BigDecimal.TEN,BigDecimal.ONE);

        System.out.println(" Toplam : "  + sonucToplam);
        System.out.println(" Çıkarma : "  + sonucFark);
        System.out.println(" *****************************");

        // Bu sorunu çözmek için bir islem interface classını oluşturuyoruz.
        // iligli tüm işlemleri ir interfaceden türeterek comman design pattern uyguluyoruz.

        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);

        BigDecimal toplam = HesapMakinesi2.islem(new ToplamaCommand(), sayi1, sayi2);
        BigDecimal cikarma = HesapMakinesi2.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carpma = HesapMakinesi2.islem(new CarpmaCommand(), sayi1, sayi2);
        BigDecimal bolme = HesapMakinesi2.islem(new BolmeCommand(), sayi1, sayi2);

        System.out.println(" Toplam : "  + toplam);

        System.out.println(" Çıkarma : "  + cikarma);

        System.out.println(" Çarpma : "  + carpma);

        System.out.println(" Bölme : "  + bolme);

    }
}
