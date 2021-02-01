package com.firatcapin.desingpatterns.structural.bridge.sonrası.cihaz;

import com.firatcapin.desingpatterns.structural.bridge.sonrası.Muzik;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar.Fizy;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar{
    public BilgisayarKF(){
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar çalıştı.");
        super.muzikCal(muzik);
    }
}
