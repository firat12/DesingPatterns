package com.firatcapin.desingpatterns.behavioarol.mediator;

import java.math.BigDecimal;

public class DomatesUreticisi extends Uretici {
    public DomatesUreticisi(String adi, BigDecimal fiyat, AraciMediator araciMediator) {
        super(adi, fiyat, EnumUrun.DOMATES, araciMediator);
    }
}
