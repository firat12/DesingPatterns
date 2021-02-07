package com.firatcapin.desingpatterns.behavioarol.state;

public class Hucum implements Konsol {
    @Override
    public void kareTusuBas() {
        yapilacakIslem("Tuş çekiliyor.");
    }

    @Override
    public void ucgenTusunaBas() {
        yapilacakIslem("Ara  pas veriliyor.");
    }

    @Override
    public void daireTusunaBas() {
        yapilacakIslem("Orta açılıyor.");
    }

    @Override
    public void xTusunaBas() {
        yapilacakIslem("Kisa  pas veriliyor.");
    }

    private void yapilacakIslem(String durum) {
        System.out.println(durum);
    }
}
