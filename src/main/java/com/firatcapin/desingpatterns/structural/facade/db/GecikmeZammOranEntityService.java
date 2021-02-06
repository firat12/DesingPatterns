package com.firatcapin.desingpatterns.structural.facade.db;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GecikmeZammOranEntityService {
    public BigDecimal getGecikmeZammiOran() {
       BigDecimal oran =  new BigDecimal("1.6");
       oran = oran.divide(new BigDecimal(100), 4, RoundingMode.HALF_DOWN);
       return oran;
    }
}
