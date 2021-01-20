package com.firatcapin.desingpatterns.creatianol.builder;

public class BuilderEv {
    private String il;
    private String ilce;
    private String mahalle;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;
    private Boolean isDublex;
    private Boolean isEsyali;
    private Boolean isOtopark;

    public static BuilderEv startBuild(){
        return new BuilderEv();
    }


    public Ev build(){
        Ev ev = new Ev();
        ev.setMahalle(mahalle);
        ev.setIl(il);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setIlce(ilce);
        ev.setOdaSayisi(odaSayisi);
        ev.setOtopark(isOtopark);
        ev.setTuvaletSayisi(tuvaletSayisi);
        return ev;
    }

    public BuilderEv setIl(String il) {
        this.il = il;
        return this;
    }

    public BuilderEv setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public BuilderEv setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public BuilderEv setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public BuilderEv setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public BuilderEv setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public BuilderEv setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public BuilderEv setDublex(Boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public BuilderEv setEsyali(Boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public BuilderEv setOtopark(Boolean otopark) {
        isOtopark = otopark;
        return this;
    }
}
