package com.firatcapin.desingpatterns.behavioarol.observer;

public class Ebeveyn implements Observer {

    private String adi;


    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observable observable) {
        TermemetreObserver termemetreObserver = (TermemetreObserver) observable;

        System.out.println("Adı : " + adi + " \n sicaklik : " + termemetreObserver.getAnlikSıcaklik() + " derece  olmuş.");
    }
}
