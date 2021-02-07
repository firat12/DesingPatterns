package com.firatcapin.desingpatterns.behavioarol.observer;

import java.math.BigDecimal;

public class AppObserver {

    public static void main(String[] args) {
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        TermemetreObserver termemetreObserver = new TermemetreObserver(maxSicaklik, minSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        // Anne ve Babayı tetiklemedgm sürece uyır vermeyecek.
        termemetreObserver.ekle(anne);
        termemetreObserver.ekle(baba);

        for(int i = termemetreObserver.getAnlikSıcaklik().intValue(); i<=30; i++){
            termemetreObserver.setAnlikSıcaklik(BigDecimal.valueOf(i));
        }


        for(int i = termemetreObserver.getAnlikSıcaklik().intValue(); i>=22; i--){
            termemetreObserver.setAnlikSıcaklik(BigDecimal.valueOf(i));
        }

    }
}
