package com.firatcapin.desingpatterns.creatianol.abstract_factory;

public class TelefonBayisi {
    public static void main(String[] args) {
        S8Factory s8Fabrikasi = new S8Factory();
        Telefon s8 = s8Fabrikasi.getTelefon("s8","2600",4,8);

        Note8Factory note8Fabrikasi = new Note8Factory();
        Telefon note8 = note8Fabrikasi.getTelefon("NOTE8","3000",4,8);

        System.out.println(s8);
        System.out.println(note8);
    }
}
