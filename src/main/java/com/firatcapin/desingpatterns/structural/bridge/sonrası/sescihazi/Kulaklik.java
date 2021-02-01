package com.firatcapin.desingpatterns.structural.bridge.sonrası.sescihazi;

public class Kulaklik implements ISesCihazi{
    @Override
    public void sesiCal(String ses) {
        System.out.println("Kulaklık ses çalıyor -> " + ses);
    }
}
