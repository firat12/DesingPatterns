package com.firatcapin.desingpatterns.creatianol.abstract_factory;

public class Note8Factory implements TelefonFactory{
    @Override
    public Telefon getTelefon(String model, String batarya, Integer en, Integer boy) {
        return new Note8(model,batarya,en,boy);
    }
}
