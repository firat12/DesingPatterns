package com.firatcapin.desingpatterns.creatianol.prototype;

import java.util.Date;

public class AppClone {
    public static void main(String[] args) {
        // Bu işlemi threadi 2 sn sürüyor
        // Bu nesneyi 3 kez yaptığımızı düşünelim 6 sn oluyor.
        // Bu büyük bir sorunn aslında.
        GenericEntityService service = new GenericEntityService();
        Date firsDate = new Date();
        File file = service.findByFileById(1L);
        filePrint(firsDate, file);

        // Bu sorunu şu şekilde çözümlüyoruz.
        // file clasına Cloneable classını implement ediyoruz.
        Date firstDateClone = new Date();
        File fileClone = null;
        try {
            fileClone = file.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        // Yüzeysel(Shallow Clone) olduğu için . Yüzeysel clone işleminde sadece kendi nesnemizi klonluyoruz.
        // Alt nesneler olan filetype veya cotegory nesnesini clonlamıyoruz.Buna yüzeysel klonlama denir.

        fileClone.setName("Günlük");
        fileClone.setData("Sevgili günlük");
        fileClone.getFileType().setName("Kişisel Bilgiiii");
        // Bunu yazdırgımzda göreceğimiz üzere süre kaymı olmayacak.
        filePrint(firstDateClone, fileClone);

        // // Deep Clonlama (Derin bir clonlama) yapmak için diğer alt nesnelerinin de Clonable implementasyonu yapılmalı

    }

    private static void filePrint(Date firsDate, File file) {
        Date lastDate = new Date();
        System.out.println(file);
        System.out.println(getSecondDifferent(firsDate, lastDate));
        System.out.println("\n");
    }

    private static Long getSecondDifferent(Date firstDate, Date lastDate){
        long has = 1000;
        long secondDifferent = (lastDate.getTime() / has) - (firstDate.getTime() / has);
        return secondDifferent;
    }
}
