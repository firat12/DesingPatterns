package com.firatcapin.desingpatterns.behavioarol.ChainOfResponsibility;


public enum  EnumIl {
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    MALATYA("Malatya");

    private String il;

    EnumIl(String il){
        this.il = il;
    }

    public String getIl(){
        return il;
    }

    @Override
    public String toString() {
        return il;
    }
}
