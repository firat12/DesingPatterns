package com.firatcapin.desingpatterns.creatianol.factory;

public class TelefonFabrikasi {

    public static Telefon getTelefon(String model, String batarya, Integer en, Integer boy){
        Telefon telefon;
        if("s8".equalsIgnoreCase(model)){
            telefon = new S8(model, batarya, en, boy);
        }
        else if("note8".equalsIgnoreCase(model)){
            telefon = new Note8(model, batarya, en, boy);
        }else {
            throw new RuntimeException("Geçerli Bir model değildir");
        }

        return telefon;
    }
}
