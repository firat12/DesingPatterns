package com.firatcapin.desingpatterns.behavioarol.command;

import java.math.BigDecimal;

public class HesapMakinesi2 {

    // Bu metod içerisnde artık işlem interface ile işlem yapıyoruz.
    public static BigDecimal islem(Islem _islem, BigDecimal sayi1, BigDecimal sayi2) {
        return _islem.islem(sayi1,sayi2);
    }
}
