package com.firatcapin.desingpatterns.behavioarol.iterator.iteratoryeni;

import java.util.Iterator;
import java.util.List;

public class AppIteratorYeni {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
        Fasikul fasikul = new Fasikul("Turkçe Fasikül");
        Iterator soruIteratorKitap = kitap.getSorular();
        Iterator soruIteratorFasikul = fasikul.getSorular();

        yazdir(soruIteratorKitap);

        yazdir(soruIteratorFasikul);
    }

    private static void yazdir(Iterator soruIterator) {
        while (soruIterator.hasNext()) {
            Soru soru = (Soru) soruIterator.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("SoruNo : " + soruNo);
        }
    }

}
