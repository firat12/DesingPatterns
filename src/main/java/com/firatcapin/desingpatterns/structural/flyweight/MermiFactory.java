package com.firatcapin.desingpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MermiFactory {
    //Havuz ....
    private static Map<MermiBoyutu, Mermi> map = new LinkedHashMap<>();

    public static Mermi mermiUret(MermiBoyutu mermiBoyutu) {
        Mermi mermi =map.get(mermiBoyutu);
        // Gidip mermi nesnesi oluşup oluşmadgına bakıyoruz.
        if(mermi == null){
            mermi = new Mermi(mermiBoyutu);
            map.put(mermiBoyutu, mermi);
        }
        return mermi;

        //Bu şekilde bir fabrika oluşturuyoruz.
        // Bu fabrikayı asker clasında mermi üretirken de kullancağız
    }
}
