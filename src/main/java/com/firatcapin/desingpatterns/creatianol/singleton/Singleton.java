package com.firatcapin.desingpatterns.creatianol.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
     /** Bu nesneyi bu şekilde çağıramıyoruz.
      * Private olduğu için
      * **/
    private Singleton(){
        System.out.println("Singleton nesne Oluştu");
    }

    /** Nesneyi kendi için oluşturan bir metot yazıyoruz.
     * Metodu kullanabilmek için static yapıyoruz.
     * Static metotlarda kullanıclacka değişken de static olmalı.
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
