package com.firatcapin.desingpatterns.behavioarol.interpreter.yorumlayici;

import com.firatcapin.desingpatterns.behavioarol.interpreter.dil.KargaDili;
import com.firatcapin.desingpatterns.behavioarol.interpreter.dil.KusDili;

public class KargaDiliYorumlayici implements Yorumlayici{
    @Override
    public String yorumla(String soz) {
        KargaDili kargaDili = new KargaDili();
        String turkcesi = kargaDili.turkceyeCevir(soz);
        return turkcesi;
    }
}
