package com.firatcapin.desingpatterns.behavioarol.strategy;

public enum EnumBolum {
    SOZEL("Sözel"),
    SAYISAL("Sayısal"),
    ES("Eşit Ağırlık");

    private String ders;

    EnumBolum(String ders) {
        this.ders = ders;
    }


    @Override
    public String toString() {
        return "EnumBolum{" +
                "ders='" + ders + '\'' +
                '}';
    }
}
