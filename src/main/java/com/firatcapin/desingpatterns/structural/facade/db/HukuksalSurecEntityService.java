package com.firatcapin.desingpatterns.structural.facade.db;

import java.util.Arrays;
import java.util.List;

public class HukuksalSurecEntityService {
    public List<Long> findAllHukukIslem(){
        List<Long> hukuksalIslemList = Arrays.asList(1L,2L,3L,4L,5L,6L);
        return hukuksalIslemList;
    }
}
