package com.firatcapin.desingpatterns.behavioarol.interpreter;

import com.firatcapin.desingpatterns.behavioarol.interpreter.yorumlayici.KargaDiliYorumlayici;
import com.firatcapin.desingpatterns.behavioarol.interpreter.yorumlayici.KusDiliYorumlayici;
import com.firatcapin.desingpatterns.behavioarol.interpreter.yorumlayici.Yorumlayici;

public class AppInterpreter {
    // Yorumlanması gereken duurumları bu şekilde kullanabiliriz.

    public static void main(String[] args) {
        yazdir(new KusDiliYorumlayici(),getKusSoz());
        yazdir(new KargaDiliYorumlayici(),getKargaSoz());
    }

    private static void yazdir(Yorumlayici yorumlayici, String kusSozuTurkcesi) {
        System.out.println("Turkçesi : " + yorumlayici.yorumla(kusSozuTurkcesi));
    }

    private static String getKusSoz() {
        return "Fıcıracat Çacapıcın";
    }

    private static String getKargaSoz() {
        return "Fıcgıragat Çagapıgın";
    }
}
