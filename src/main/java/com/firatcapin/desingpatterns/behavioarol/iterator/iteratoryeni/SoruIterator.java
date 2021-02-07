package com.firatcapin.desingpatterns.behavioarol.iterator.iteratoryeni;

import java.util.Iterator;

public class SoruIterator implements Iterator {

    private Soru[] sorular;
    private int sira; // sıra kontrolü için

    public SoruIterator(Soru[] sorular) {
        this.sorular = sorular;
    }

    // Bu METOD BİR SONRAKİ VAR MI DİYE KONTROL EDİYOR
    @Override
    public boolean hasNext() {
        if(sira < sorular.length){
            return true;
        }
        return false;
    }

    // Eğer varsa kontrolü
    @Override
    public Object next() {
        Soru soru = sorular[sira];
        sira++;
        return soru;
    }
}
