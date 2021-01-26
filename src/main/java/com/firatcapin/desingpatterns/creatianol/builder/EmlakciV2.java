package com.firatcapin.desingpatterns.creatianol.builder;

public class EmlakciV2 {
    public static void main(String[] args) {
        // Zorunlu alanlarla bi ksııtlama sağlamış olduk.
        // Girmek zorunda olmadığımız halde girilen degerlerden kurtulmuş olduk.
        // Sonradan eklemek istediğimiz degerleri aşağıda görüldüğü gibi setliyoruz.
       Ev ev1= BuilderEv.startBuild("Istanbul","Ataşehir","Yenimah",3)
                .setBalkonSayisi(2)
                .setBanyoSayisi(3)
                .setDublex(true)
                .build();
        printEv(ev1);
    }

    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev Özellikleri : " + ev);
        System.out.println();
    }
}
