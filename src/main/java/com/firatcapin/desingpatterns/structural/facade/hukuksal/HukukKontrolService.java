package com.firatcapin.desingpatterns.structural.facade.hukuksal;

import com.firatcapin.desingpatterns.structural.facade.db.HukuksalSurecEntityService;

import java.util.List;

public class HukukKontrolService {
    private HukuksalSurecEntityService hukuksalSurecEntityService;

    public HukukKontrolService() {
        this.hukuksalSurecEntityService = new HukuksalSurecEntityService();
    }

    public boolean isHukuksalIslemde(Long borcId) {
        List<Long> hukuksalIslemdekiBorcList = hukuksalSurecEntityService.findAllHukukIslem();

        boolean isHkukIslemde = hukuksalIslemdekiBorcList.contains(borcId);

        if(isHkukIslemde){
            System.out.println("Borç Hukuksal işlemde. Tahsil edilemez!");
        }

        return isHkukIslemde;
    }
}
