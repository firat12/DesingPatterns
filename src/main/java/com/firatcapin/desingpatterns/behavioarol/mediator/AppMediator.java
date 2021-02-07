package com.firatcapin.desingpatterns.behavioarol.mediator;

import java.math.BigDecimal;

public class AppMediator {
    public static void main(String[] args) {
        Komisyoncu komisyoncu = new Komisyoncu();

        DomatesUreticisi domatesUreticisi = new DomatesUreticisi("Firat", BigDecimal.valueOf(4.5), komisyoncu);
        DomatesUreticisi domatesUreticisi2 = new DomatesUreticisi("Cihan", BigDecimal.valueOf(3.5), komisyoncu);
        DomatesUreticisi domatesUreticisi3 = new DomatesUreticisi("Halil", BigDecimal.valueOf(5.5), komisyoncu);

        DomatesPazarcisi domatesPazarcisi = new DomatesPazarcisi("Kaan", BigDecimal.valueOf(6.2), komisyoncu);
        DomatesPazarcisi domatesPazarcisi1 = new DomatesPazarcisi("Ozan", BigDecimal.valueOf(4.1), komisyoncu);

        komisyoncu.ureticiEkle(domatesUreticisi);
        komisyoncu.ureticiEkle(domatesUreticisi2);
        komisyoncu.ureticiEkle(domatesUreticisi3);

        komisyoncu.pazarEkle(domatesPazarcisi);
        komisyoncu.pazarEkle(domatesPazarcisi1);

        // Üretici için en uygun pazarciya urunünü satti. Bu kişi kaan
        domatesUreticisi.urunSat();

        // Paazarci kendisiiçin en uygun domates üreticisnden ürün alıyor.
        domatesPazarcisi.urunAl();


    }
}
