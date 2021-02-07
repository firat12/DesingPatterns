package com.firatcapin.desingpatterns.behavioarol.mediator;

import java.math.BigDecimal;

public class DomatesPazarcisi extends Pazarci {
    public DomatesPazarcisi(String adi, BigDecimal fiyat, AraciMediator araciMediator) {
        super(adi, EnumUrun.DOMATES, fiyat, araciMediator);
    }
}
