package com.firatcapin.desingpatterns.structural.adapter;

public class SamsungTelefon implements Telefon{
    private int calismaVolt;

    public SamsungTelefon() {
        this.calismaVolt = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Sansung Telefon Sarj Oluyor...");
        return calismaVolt;
    }
}
