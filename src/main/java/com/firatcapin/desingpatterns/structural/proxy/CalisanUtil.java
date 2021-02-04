package com.firatcapin.desingpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CalisanUtil {
    public static List<Calisan> getCalisanList(){
        Calisan firat = new Calisan("firat", "123", true);
        Calisan cihan = new Calisan("cihan", "0606", false);
        Calisan test = new Calisan("test","12345", false);
        Calisan deneme = new Calisan("deneme", "4578", false);

        List<Calisan> list = new ArrayList<>();
        list.add(firat);
        list.add(cihan);
        list.add(test);
        list.add(deneme);

        return list;
    }

    public static Map<String, Calisan> getKullaniciAdiCalisanMap(){
        List<Calisan> calisanList = getCalisanList();
        Map<String, Calisan> map= new LinkedHashMap<>();
        for(Calisan calisan : calisanList){
            map.put(calisan.getKullaniciAdi(),calisan);
        }

        return map;
    }

    public static Calisan getCalisanKullaniciAdi(String kullaniciAdi){
        Map<String, Calisan> map = getKullaniciAdiCalisanMap();
        Calisan calisan =map.get(kullaniciAdi);
        return calisan;
    }

    public static boolean isKullaniciValid(String kullaniciAdi, String sifre) {
        boolean isKullaniciValid = false;
        Calisan calisan = getCalisanKullaniciAdi(kullaniciAdi);
        if(calisan != null){
            isKullaniciValid = calisan.getSifre().equals(sifre);
        }
        return isKullaniciValid;
    }
}
