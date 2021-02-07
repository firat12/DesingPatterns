package com.firatcapin.desingpatterns.behavioarol.mediator;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class Komisyoncu implements AraciMediator {

    private List<Uretici> ureticiList;
    private List<Pazarci> pazarciList;

    public Komisyoncu() {
        ureticiList = new ArrayList<>();
        pazarciList = new ArrayList<>();
    }

    @Override
    public void ureticiEkle(Uretici uretici) {
        ureticiList.add(uretici);
    }

    @Override
    public void pazarEkle(Pazarci pazarci) {
        pazarciList.add(pazarci);
    }

    @Override
    public void ureticidenAl(Uretici uretici) {
        Pazarci pazarci= enUygunPazarciyiBul(uretici.getUrun()); // Ürün bazında pazarci bul
        satisYap(uretici, pazarci);
    }

    @Override
    public void pazarciyaSat(Pazarci pazarci) {
        Uretici uretici = enUygunUreticiBul(pazarci.getUrun()); // Ürün bazında üretici bul
        alisYap(pazarci, uretici);
    }

    private Pazarci enUygunPazarciyiBul(EnumUrun urun) {
        Pazarci enUygunPazarci = null;

        for (Pazarci pazarci : pazarciList) {
            if(urun.equals(pazarci.getUrun())){
                BigDecimal ureticiFiyati = pazarci.getFiyat();

                if(enUygunPazarci == null || enUygunPazarci.getFiyat().compareTo(ureticiFiyati) < 0){
                    enUygunPazarci = pazarci;
                }
            }
        }

        return enUygunPazarci;
    }

    private Uretici enUygunUreticiBul(EnumUrun urun) {
        Uretici enUygunUretici = null;

        for (Uretici uretici : ureticiList) {
            if(urun.equals(uretici.getUrun())){
                BigDecimal ureticiFiyati = uretici.getUrunFiyati();

                if(enUygunUretici == null || enUygunUretici.getUrunFiyati().compareTo(ureticiFiyati) > 0){
                    enUygunUretici = uretici;
                }
            }
        }

        return enUygunUretici;
    }

    private void satisYap(Uretici uretici, Pazarci pazarci) {
        System.out.println(uretici.getAd() + " isimli üretici "
                + pazarci.getAdi() + " pazarcısına " + uretici.getUrun().getUrun() + " ürünü sattı.");
    }

    private void alisYap(Pazarci pazarci, Uretici uretici) {
        System.out.println(pazarci.getAdi() + " isimli pazarci "
                + uretici.getAd() + " üreticisinden " + uretici.getUrun().getUrun() + " ürünü aldı.");
    }
}
