package com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar;

import com.firatcapin.desingpatterns.structural.bridge.sonrası.Muzik;

public class Spotify implements IMuzikCalar{

    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor.");
        return muzik.getSes();
    }

}
