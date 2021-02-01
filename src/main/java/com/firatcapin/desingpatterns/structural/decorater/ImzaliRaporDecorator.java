package com.firatcapin.desingpatterns.structural.decorater;

public class ImzaliRaporDecorator extends RaporDecorator{
    public ImzaliRaporDecorator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();

        String imzaliMetin = RaporUtil.imzaliMetiin(metin);
        return imzaliMetin;
    }
}
