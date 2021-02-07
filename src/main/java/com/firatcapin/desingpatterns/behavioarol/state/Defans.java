package com.firatcapin.desingpatterns.behavioarol.state;

public class Defans implements Konsol {
    @Override
    public void kareTusuBas() {
        yapilacakIslem("Müdahale Ediliyor");
    }

    @Override
    public void ucgenTusunaBas() {
        yapilacakIslem("Kaleci açılıyor");
    }

    @Override
    public void daireTusunaBas() {
        yapilacakIslem("Kayarak Mudahale ediyor");
    }

    @Override
    public void xTusunaBas() {
        yapilacakIslem("Markaj yapıyor");
    }

    private void yapilacakIslem(String durum) {
        System.out.println(durum);
    }

}
