package com.firatcapin.desingpatterns.creatianol.builder;

public class Ev {
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

    public Ev() {
    }

    public Ev(String il, String ilce, String mahalle, int odaSayisi, int banyoSayisi, int tuvaletSayisi, int balkonSayisi, Boolean isDublex, Boolean isEsyali, Boolean isOtopark) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.balkonSayisi = balkonSayisi;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.isOtopark = isOtopark;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public Boolean getDublex() {
        return isDublex;
    }

    public void setDublex(Boolean dublex) {
        isDublex = dublex;
    }

    public Boolean getEsyali() {
        return isEsyali;
    }

    public void setEsyali(Boolean esyali) {
        isEsyali = esyali;
    }

    public Boolean getOtopark() {
        return isOtopark;
    }

    public void setOtopark(Boolean otopark) {
        isOtopark = otopark;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", isOtopark=" + isOtopark +
                '}';
    }
}
