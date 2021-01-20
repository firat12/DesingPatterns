package com.firatcapin.desingpatterns.creatianol.factory;

public class TelefonBayi {
    public static void main(String[] args) {
        Telefon s8 = TelefonFabrikasi.getTelefon("S8","2600", 4 ,8);
        Telefon note8 = TelefonFabrikasi.getTelefon("note8","3000", 5 ,10);

        System.out.println("S8 Özellikleri : " + s8.toString());
        System.out.println("Note8  Özellikleri : " + note8.toString());
    }
}
