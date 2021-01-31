package com.firatcapin.desingpatterns.structural.adapter;

public class Buzdolabı implements ElektrikliEvAletleri{
    int volt;

    public Buzdolabı() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        return volt;
    }
}
