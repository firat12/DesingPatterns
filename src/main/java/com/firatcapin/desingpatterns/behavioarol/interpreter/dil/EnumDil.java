package com.firatcapin.desingpatterns.behavioarol.interpreter.dil;

import com.firatcapin.desingpatterns.behavioarol.ChainOfResponsibility.EnumIl;

public enum EnumDil {
    KUS("Kuş","ca"), // kuş için gelecek ek ca
    KARGA("Karga", "ga");

    private String isim;
    private String ek;

    EnumDil(String isim, String ek){
        this.isim = isim;
        this.ek = ek;
    }

    public String getIsim() {
        return isim;
    }

    public String getEk() {
        return ek;
    }
}
