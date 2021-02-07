package com.firatcapin.desingpatterns.behavioarol.iterator;
import java.util.List;

public class AppIterator {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
        List<Soru> soruList = kitap.getSoruList();

        yazdir(soruList);

        /**
         * Dikkat edecek olursak yazdir metodunun içerisiyle aynı işlemi yapıyoruz.
         * Ama yazdır metodunu kullanmak istediğimizde hata alırız.
         * Bunun için ne ypıyoruz fasikul içinde ayrı bir yazdır emtodu yazmak zorunda kalıyoruz.
         * Bu gibi sorunların önüne geçmek için iterator diye birşey var. AppItertor2 calssını inceleyiiz.
         */
        Fasikul fasikul = new Fasikul("Turkçe Fasikül");
        Soru[] sorular = fasikul.getSorular();

        for(Soru soru : sorular){
            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No : " + soruNo );
        }

    }

    private static void yazdir(List<Soru> soruList){
        for (Soru soru : soruList) {
            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No : " + soruNo );
        }
    }
}
