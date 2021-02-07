package com.firatcapin.desingpatterns.behavioarol.state;

public class Oyun {

    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun başlıyor.");
        konsol = new Hucum();
    }

    public void ucgen(){
        konsol.ucgenTusunaBas();
    }

    public void kare(){
        konsol.kareTusuBas();
    }

    public void yuvarlakBas(){
        konsol.daireTusunaBas();
    }

    public void xBas(){
        konsol.xTusunaBas();
    }

    public void topuKap() {
        System.out.println("Topu kap. Hucuma Çık");
        konsol = new Hucum();
    }

    public void topuKaptir(){
        System.out.println("Top kaptırıldı. Defans yap.");
        konsol = new Defans();
    }

}
