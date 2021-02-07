package com.firatcapin.desingpatterns.behavioarol.interpreter.dil;

import com.firatcapin.desingpatterns.behavioarol.ChainOfResponsibility.EnumIl;

public abstract class Dil {
    private EnumDil dil;

    public Dil(EnumDil dil) {
        this.dil = dil;
    }

    public String turkceyeCevir(String soz) {
        String[] kelimeler =  soz.split(dil.getEk());
        String turkce = "";
        for(String kelime :  kelimeler){
            String  turkceKelime = kelimeyiTurkceyiCevir(kelime);

            turkce = turkce + " " + turkceKelime;
        }

        return turkce;
    }

    /**
     * ornek : secelacam -> se-ce-la-ca-m şeklinde cevirmesi
     * @param kelime
     * @return
     */
    private String kelimeyiTurkceyiCevir(String kelime) {
        String kelimeAyarlayici = kelime;

        String heceleri = hecele(kelimeAyarlayici);

        String[] heceList = heceleri.split("-");

        String kelimeninTurkcesi = hecelerdenKelimeBul(heceList);

        return kelimeninTurkcesi;
    }

    /**
     * bu meyotun çıktısı :
     * se
     * ce
     * la
     * ca
     * m
     * Burdan ce - ca ları çıkracağız
     * @param heceList
     * @return
     */
    private String hecelerdenKelimeBul(String[] heceList) {

        int i = 0;
        String turkceKelime = "";
        for(String hece : heceList){
            if(i % 2 == 0){
                turkceKelime = turkceKelime + hece;
            }
            i++;
        }

        return turkceKelime;
    }

    /**
     * Her bir hece arasına - koyacak
     * secelacam -> se-ce-la-ca-m
     * @param kelimeAyarlayici
     * @return
     */
    private String hecele(String kelimeAyarlayici) {
        String hecelenmisHali = "";
        while (kelimeAyarlayici.length() > 0){
            String hece = getHece(kelimeAyarlayici);
            hecelenmisHali = hecelenmisHali + hece + "-";
            kelimeAyarlayici =  kelimeAyarlayici.replace(hece,"");
        }

        return hecelenmisHali;
    }

    // kelimeyi hecelerine ayırma
    private String getHece(String kelime) {
        int boyut = dil.getEk().length();

        if(kelime.length() < boyut){
            boyut = kelime.length();
        }

        String substring = kelime.substring(0, boyut);

        return substring;
    }
}
