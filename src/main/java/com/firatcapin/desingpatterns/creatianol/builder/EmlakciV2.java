package com.firatcapin.desingpatterns.creatianol.builder;

public class EmlakciV2 {
    public static void main(String[] args) {
        BuilderEv.startBuild().setIl("Istanbul")
                .setBalkonSayisi(2)
                .setBanyoSayisi(3)
                .setDublex(true)
                .setEsyali(false)
                .setIlce("Ataşehir")
                .setMahalle("Yenimah")
                .build();

    }

    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev Özellikleri : " + ev);
        System.out.println();
    }
}
