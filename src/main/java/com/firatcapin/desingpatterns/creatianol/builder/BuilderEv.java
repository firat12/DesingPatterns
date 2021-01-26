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

    // Zorunlu alanları startBuild parametleri olarka ekliyoruz
    public static BuilderEv startBuild(String il, String ilce,String mahalle,int odaSayisi){
        BuilderEv evBuilder = new BuilderEv();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.mahalle = mahalle;
        evBuilder.odaSayisi = odaSayisi;
        return evBuilder;
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
