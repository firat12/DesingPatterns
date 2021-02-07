package com.firatcapin.desingpatterns.behavioarol.state;

public class AppState {
    public static void main(String[] args) {
        Oyun oyun = new Oyun();
        oyun.xBas();
        oyun.ucgen();
        oyun.kare();
        oyun.topuKaptir();
        oyun.xBas();
        oyun.kare();
        oyun.topuKap();
    }
}
