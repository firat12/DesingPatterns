package com.firatcapin.desingpatterns.structural.facade.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date getGununTarihi()  {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String dateStr = format.format(new Date());
        Date date = null;
        try {

            date = format.parse(dateStr);

        }catch (ParseException ex){
            ex.printStackTrace();
        }
        return date;
    }

    public static long gunFarkHesapla(Date ilkTarih, Date sonTarih){
        int gunKatsayisi = 24 * 60 * 60 * 1000;
        long ilk = ilkTarih.getTime();
        long son = sonTarih.getTime();

        long gunFarki = (son / gunKatsayisi) - (ilk / gunKatsayisi);
        return gunFarki;

    }

    public static Long tarihinYili(Date date){
        String yilStr = new SimpleDateFormat("yyyy").format(date);
        return Long.valueOf(yilStr);
    }


    public static Long tarihinAyi(Date date){
        String ayStr = new SimpleDateFormat("MM").format(date);
        return Long.valueOf(ayStr);
    }

    public static Date tarihOlustur(String s) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try{
            date = format.parse(s);
        }catch (ParseException e){
            e.printStackTrace();
        }

        return date;
    }
}
