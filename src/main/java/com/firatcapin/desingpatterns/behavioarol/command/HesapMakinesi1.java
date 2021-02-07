package com.firatcapin.desingpatterns.behavioarol.command;

import java.math.BigDecimal;

public class HesapMakinesi1 {

    public static BigDecimal islem(IslemTuru islemTuru, BigDecimal sayi1, BigDecimal sayi2){
        BigDecimal sonuc = BigDecimal.ZERO;

        if(IslemTuru.TOPLAMA.equals(islemTuru)){
            sonuc = sayi1.add(sayi2);
        }else if(IslemTuru.CIKARMA.equals(islemTuru)){
            sonuc = sayi1.subtract(sayi2);
        }else if(IslemTuru.CARPMA.equals(islemTuru)){
            sonuc = sayi1.multiply(sayi2);
        }else if(IslemTuru.BOLME.equals(islemTuru)){
            sonuc = sayi1.divide(sayi2);
        }
        // Bu if else ile kontrl mekanizması doğru değildir.
        // Burada 50 fakrlı islem turu olsa her biri için if eklemeke zorunda kalacağız.
        // Bu şekilde open/closed presnbiini de ezmiş oluyoruz.

        return sonuc;
    }
}
