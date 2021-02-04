package com.firatcapin.desingpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AppFlyweight {
    public static void main(String[] args) {
        List<Asker> askerList = new ArrayList<>();
        Yuzbasi yuzbasi = new Yuzbasi();
        askerList.add(yuzbasi);

        for(int i =0;i<50;i++){
            Er er = new Er();
            askerList.add(er);
        }

        for (Asker asker : askerList) {
            asker.atesEt();
        }

        System.out.println("*************** Düzeltilmiş ********************");
        /**
         * Bu şekilde çalıştırdıgımızda her defasında 3 SN bekliyoruz.
         * Her bir mer atışında ki bu performasn sorununu bir mermi havuzu oluşturarak aşabiliriz.
         * MermiFactory calssını oluşturuyoruz.
         * Böylece daha öncesnde her ateş et eyleminde mermi nesnesinin tekrardan oluşmaısnın önüne geçmiş oluyoruz.
         * Aşağıaki örnek;
         */
        for (Asker asker : askerList) {
            asker.atesEt2();
        }

        for (Asker asker : askerList) {
            asker.tara();
        }

    }
}
