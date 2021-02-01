package com.firatcapin.desingpatterns.structural.decorater;

public class RaporDecorator implements Rapor{
    private Rapor rapor;

    public RaporDecorator(Rapor rapor) {
        this.rapor = rapor;
    }

    @Override
    public String getMetin() {
        return rapor.getMetin();
    }
}
