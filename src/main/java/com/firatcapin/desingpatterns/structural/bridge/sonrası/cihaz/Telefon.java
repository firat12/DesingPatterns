package com.firatcapin.desingpatterns.structural.bridge.sonrası.cihaz;

import com.firatcapin.desingpatterns.structural.bridge.sonrası.Muzik;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar.IMuzikCalar;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.sescihazi.ISesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar{
    public Telefon(ISesCihazi sesCihazi, IMuzikCalar muzikCalar) {

        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor.");
        super.muzikCal(muzik);
    }
}
