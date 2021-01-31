package com.firatcapin.desingpatterns.structural.adapter;

public class AdapterRun {
    public static void main(String[] args) {
        Priz priz = new Priz();

        // Ütü ve buzdolaı 220 volta çalıştı
        Utu utu = new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        // elgeleim samsung telefon. Ama samsung elektrikli ev aleti olmadıgı için çalışmıyor.
        // Prizi değiştirmek veya ev aletlerini değiştirmek mantıklı olmaadıgı için
        // Araya bir adapter class yazıyoruz. TelefonElektrikliEvAletleriAdapter classını oluşturuyoruz.

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonElektrikliEvAletleriAdapter adapter = new TelefonElektrikliEvAletleriAdapter(samsungTelefon);
        priz.elektrikVer(adapter);
    }
}

