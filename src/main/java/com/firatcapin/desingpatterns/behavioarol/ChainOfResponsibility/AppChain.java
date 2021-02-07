package com.firatcapin.desingpatterns.behavioarol.ChainOfResponsibility;

public class AppChain {
    public static void main(String[] args) {
        KargoSirketi fratKargo = FiratKargo.getKargoSirketi();
        fratKargo.kargola(EnumIl.ISTANBUL);
    }
}
