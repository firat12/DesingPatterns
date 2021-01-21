package com.firatcapin.desingpatterns.creatianol.singleton;


public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton;

    /** Uygulama ilk başlatıldığında çalışır.  Static  oldugundan instance oluşmadanburası çalışır. **/
    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){
        }
    }

    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton getStaticBlockSingleton() {
        return staticBlockSingleton;
    }

    public void singletonTest(){
        System.out.println("Static Block Singleton method calisti");
    }
}
