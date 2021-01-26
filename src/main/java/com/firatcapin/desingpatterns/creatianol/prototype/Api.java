package com.firatcapin.desingpatterns.creatianol.prototype;

import java.util.Date;

public class Api {
    public static void main(String[] args) {
        // Bu işlemi threadi 2 sn sürüyor
        // Bu nesneyi 3 kez yaptığımızı düşünelim 6 sn oluyor.
        // Bu büyük bir sorunn aslında.
        GenericEntityService service = new GenericEntityService();

        filePrint(service, 1L);

        filePrint(service, 2L);

        // Bu sorunun Çözümü AppClone Classında
    }

    private static void filePrint(GenericEntityService service, long l) {
        Date firsDate = new Date();
        File file = service.findByFileById(l);
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
