package com.firatcapin.desingpatterns.structural.decorater;

import java.util.ArrayList;
import java.util.List;

public class RaporUtil {
    public static String cizgiliMetin(String metin){
        String[] satirList = metin.split("\n");
        String cizgilimetin = "";

        for (String satir : satirList){
           String cizgiliSatir = herSatiraBirCizgiEkl(satir);
           cizgilimetin = cizgilimetin + cizgiliSatir;
        }
        return metin;
    }

    private static String herSatiraBirCizgiEkl(String satir){
        String yeniSatir;
        if(satir.trim().length() == 0){
            yeniSatir = "\n" + satir;
        }else{
            yeniSatir = "\n-"+satir;
        }

        return yeniSatir;
    }

    public static String metniSigdir(String metin, int genislik) {
        String kucukSatirliMetin = "";
        String[] satirList = metin.split("\n");
        for (String satir : satirList) {
            if(satirList.length <= genislik){
                // aynen ekle
                kucukSatirliMetin = ekleYeniSatiraGec(kucukSatirliMetin, satir);
            }else{
                // küçült ve öyle ekle
                List<String> parcalanmis = parcala(satir, genislik);
                
                for(String eachYeniSatir : parcalanmis){
                  kucukSatirliMetin = ekleYeniSatiraGec(kucukSatirliMetin, eachYeniSatir);
                }
            }
        }
        return  kucukSatirliMetin;
    }

    private static String ekleYeniSatiraGec(String anaMetin, String eklenecekMetin) {
        return anaMetin + eklenecekMetin + "\n";
    }

    private static List<String> parcala(String eachSatir, int genislik) {
        List<String> parcaliSatirList =new ArrayList<>();
        for(int i = 0; i <= eachSatir.length()/30;i++){
            int ilkHane = genislik + i;
            int sonHane = ilkHane + genislik;

            if(sonHane > eachSatir.length()){
                sonHane = eachSatir.length();
            }

            String parcaliSatir = eachSatir.substring(ilkHane,sonHane);

            if(parcaliSatir.trim().length() > 0){
                parcaliSatirList.add(parcaliSatir);
            }

        }

        return parcaliSatirList;
    }

    public static String imzaliMetiin(String metin) {
        String imza = "\n\n" + "\t\t\t\t\t\t" + " İmza : ";
        return  imza;
    }
}
