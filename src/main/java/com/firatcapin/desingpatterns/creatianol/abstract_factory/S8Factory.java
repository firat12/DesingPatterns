package com.firatcapin.desingpatterns.creatianol.abstract_factory;

import com.firatcapin.desingpatterns.creatianol.factory.TelefonFabrikasi;

public class S8Factory implements TelefonFactory {
    @Override
    public Telefon getTelefon(String model, String batarya, Integer en, Integer boy) {
        return new S8(model,batarya,en,boy);
    }
}
