package com.firatcapin.desingpatterns.behavioarol.interpreter.yorumlayici;

import com.firatcapin.desingpatterns.behavioarol.interpreter.dil.KusDili;

public class KusDiliYorumlayici implements Yorumlayici{
    @Override
    public String yorumla(String soz) {
        KusDili kusDili = new KusDili();
        String turkcesi = kusDili.turkceyeCevir(soz);
        return turkcesi;
    }
}
