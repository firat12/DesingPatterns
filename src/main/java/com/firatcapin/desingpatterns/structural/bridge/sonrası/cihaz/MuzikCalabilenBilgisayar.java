package com.firatcapin.desingpatterns.structural.bridge.sonrası.cihaz;

import com.firatcapin.desingpatterns.structural.bridge.sonrası.Muzik;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar.IMuzikCalar;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.sescihazi.ISesCihazi;

public abstract class MuzikCalabilenBilgisayar {
    protected ISesCihazi sesCihazi;
    protected IMuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(ISesCihazi sesCihazi, IMuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    void muzikCal(Muzik muzik){
        muzikCalar.muzikCal(muzik);
    }
}
