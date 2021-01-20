package com.firatcapin.desingpatterns.creatianol.builder;

public class Emlakci {

    public static void main(String[] args) {
        Ev ev1 = new Ev();
        ev1.setIl("IStanbul");
        ev1.setIlce("Ataşehir");
        ev1.setMahalle("Cennet");

        Ev ev2 = new Ev("İstanbul", "Esenyurt","Ağaç",2,3,1,2,
                false,true,true);

        printEv(ev1);

        printEv(ev2);
    }

    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev Özellikleri : " + ev);
        System.out.println();
    }
}
