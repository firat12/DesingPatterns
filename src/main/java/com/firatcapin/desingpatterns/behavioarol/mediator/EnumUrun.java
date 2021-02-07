package com.firatcapin.desingpatterns.behavioarol.mediator;

public enum EnumUrun {
    DOMATES("Domates"),
    SALATALIK("Domates"),
    BIBER("Domates");

    private String urun;

    EnumUrun(String urun) {
        this.urun = urun;
    }

    public String getUrun() {
        return urun;
    }
}
