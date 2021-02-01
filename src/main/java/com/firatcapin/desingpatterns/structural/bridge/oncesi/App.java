package com.firatcapin.desingpatterns.structural.bridge.oncesi;

public class App {
    public static void main(String[] args) {
        /**
         * Bu şekilde birbiryle yapıs ilişki kurulan nesneler oluşturduk
         * Ama diyelim hoparlordn değil de kulaklıkdan dinlemek istiyorum.
         * Sonrası klasörünün altında ilişkisel yapıyı inceleyelim.
         * her ihtiyacaıma göre nesne tanımlamamk için Bridge design pattern kullanıyoruz.
         */
        Muzik muzik = new Muzik("Sezen Aksu-Gülümse", "Gülümse Hadi Gülümse");
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
}
