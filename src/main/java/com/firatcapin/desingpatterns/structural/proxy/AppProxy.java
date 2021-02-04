package com.firatcapin.desingpatterns.structural.proxy;

import java.math.BigDecimal;

public class AppProxy {
    public static void main(String[] args) throws IllegalAccessException {
        YoneticiProxy yoneticiProxy = new YoneticiProxy("cihan", "0606");

        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println("Şirket Cirosu: " + ciro);
        }catch (IllegalAccessException ex){
            System.out.println("Bu bilgiye ulaşma yetkiniz yok");
        }

    }
}
