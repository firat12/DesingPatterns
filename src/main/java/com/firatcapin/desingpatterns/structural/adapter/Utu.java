package com.firatcapin.desingpatterns.structural.adapter;

public class Utu implements ElektrikliEvAletleri{

    int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        return volt;
    }
}
