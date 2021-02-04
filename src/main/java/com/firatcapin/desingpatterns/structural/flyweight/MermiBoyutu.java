package com.firatcapin.desingpatterns.structural.flyweight;

public enum MermiBoyutu {
    UC(3),
    BES(5),
    YEDI(7);

    private int boyut;

    MermiBoyutu(int boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return String.valueOf(boyut);
    }

    public int getBoyut() {
        return boyut;
    }
}
