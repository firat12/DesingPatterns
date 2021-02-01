package com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar;

import com.firatcapin.desingpatterns.structural.bridge.sonrası.Muzik;

public class Fizy implements IMuzikCalar{

    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy " + muzik + " şarkısını çalıyor.");
        return muzik.getSes();
    }

}
