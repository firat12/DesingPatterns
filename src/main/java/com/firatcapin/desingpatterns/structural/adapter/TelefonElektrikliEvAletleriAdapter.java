package com.firatcapin.desingpatterns.structural.adapter;

class TelefonElektrikliEvAletleriAdapter implements ElektrikliEvAletleri{

    private Telefon telefon;


    public TelefonElektrikliEvAletleriAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return this.telefon.sarjEt();
    }
}
