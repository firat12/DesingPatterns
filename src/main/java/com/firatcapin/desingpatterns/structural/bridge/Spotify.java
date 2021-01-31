package com.firatcapin.desingpatterns.structural.bridge;

public class Spotify {

    public String muzikCal(Muzik muzik){
        System.out.println("Sppotify : " + muzik + " şarkısını çalışıyor.");
        return muzik.getSes();
    }
}
