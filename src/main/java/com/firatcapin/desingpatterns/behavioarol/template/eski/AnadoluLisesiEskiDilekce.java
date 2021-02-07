package com.firatcapin.desingpatterns.behavioarol.template.eski;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnadoluLisesiEskiDilekce {

    private String sinif;
    private String numara;
    private String isim;

    public AnadoluLisesiEskiDilekce(String sinif, String numara, String isim) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
    }

    public void dilekceYazdir(){
        System.out.println(dilekceMetni());
    }

    private String dilekceMetni() {
        StringBuilder dilekceMetni = new StringBuilder();

        String formatliTarih = getFormatliTarih();

        dilekceMetni.append("*****************************************");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + formatliTarih);
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t" + " Malatya Anadolu Lisesi Müdürlüğüne");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t" + "Malatya");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t");
        dilekceMetni.append("Halen okulunuzun " + sinif + " sınıfında " + numara);
        dilekceMetni.append(" öğrenci numaralı öğrencisi olarak\n");
        dilekceMetni.append("öğrenime devam etmekteyim." + "Birinci");
        dilekceMetni.append(" eğitim ğretim yılı " + "20201" + "dönemi\n");
        dilekceMetni.append("içerisindeki devamsızlık durumunun tarafıma bildirilmesi hususunda");
        dilekceMetni.append("Saygılarıml Arz ederim.");

        dilekceMetni.append("\n");

        dilekceMetni.append("\t\t\t\t\t\t\t\t\t" + "Malatya");
        dilekceMetni.append("\n");

        dilekceMetni.append("*****************************************");


        return dilekceMetni.toString();
    }

    private String getFormatliTarih() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return format.format(new Date());
    }
}
