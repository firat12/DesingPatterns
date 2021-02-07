package com.firatcapin.desingpatterns.behavioarol.strategy;

public class Ogrenci {
    private EnumBolum bolum;
    private SinavStratejisi sinavStratejisi;

    public Ogrenci(EnumBolum bolum){
        this.bolum = bolum;

        if(bolum == null){
            throw new NullPointerException("Bölüm boş olamaz!");
        }

        switch (bolum) {
            case ES:
                sinavStratejisi = new EsitAgirlikStratejisi();
                break;
            case SOZEL:
                sinavStratejisi = new SozelStratejisi();
                break;
            case SAYISAL:
                sinavStratejisi = new SayisalStratejisi();
                break;
            default:
                break;
        }
    }

    public String getOncelikSirasi(){
        System.out.println(bolum +  " için strateji : ");

        String siralama = "Önce " + sinavStratejisi.getBirinci() + "çöz.\n"
                + " sonra " + sinavStratejisi.getIkinci() + " çöz. \n"
                + " Daha sonra " + sinavStratejisi.getUcuncu() + " çöz \n"
                + " Zama kalırsa " + sinavStratejisi.getDorduncu() + " çöz";

        return siralama;

    }
}
