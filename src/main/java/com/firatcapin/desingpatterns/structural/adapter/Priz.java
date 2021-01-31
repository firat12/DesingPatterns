package com.firatcapin.desingpatterns.structural.adapter;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){
        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Volt : " + volt);
    }
}
