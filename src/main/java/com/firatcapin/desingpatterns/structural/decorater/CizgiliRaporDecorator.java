package com.firatcapin.desingpatterns.structural.decorater;

public class CizgiliRaporDecorator extends RaporDecorator{

    public CizgiliRaporDecorator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin =  super.getMetin();
        String cigiliMetin = RaporUtil.cizgiliMetin(metin);
        return cigiliMetin;
    }
}
