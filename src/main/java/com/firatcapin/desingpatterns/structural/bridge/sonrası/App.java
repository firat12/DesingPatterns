package com.firatcapin.desingpatterns.structural.bridge.sonrası;

import com.firatcapin.desingpatterns.structural.bridge.oncesi.Bilgisayar;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.cihaz.BilgisayarKF;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.cihaz.Telefon;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar.Fizy;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.muzikcalar.Spotify;
import com.firatcapin.desingpatterns.structural.bridge.sonrası.sescihazi.Kulaklik;

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi Gülümse");

        System.out.println("************Bilgisayar*****************");
        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("************Telefon Fizy*****************");
        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("*************Telefon Spotify****************");
        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);
    }
}
