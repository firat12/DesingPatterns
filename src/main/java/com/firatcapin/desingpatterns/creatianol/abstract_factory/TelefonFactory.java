package com.firatcapin.desingpatterns.creatianol.abstract_factory;

public interface TelefonFactory {
    Telefon getTelefon(String model, String batarya, Integer en, Integer boy);
}
