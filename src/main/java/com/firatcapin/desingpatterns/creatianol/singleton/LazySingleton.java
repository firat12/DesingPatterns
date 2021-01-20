package com.firatcapin.desingpatterns.creatianol.singleton;

public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton(){
        System.out.println("Lazy Singleton ile oluşturuldu.");
    }


    /**
     * Nesneye ne zaman ihtiyacımız olduğunda Oluşmaısnı istiyorsak (Lazy) oluşsun istiyor isek bu şekidle bir tanımlama yapıyoruz.
     */
    public static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /** Bu işlemin dezavantajı da tek thread işlemlerde sorun yok ama
     *  multithread işlemlerde yani aynı anda getInstance() metodu çağrılırsa büyük bir sorun olmuş oluyor.
     *  Aynı anda ikiside null olacka ve ikiside aynı nesneyi birden fazla oluşturmuş olacak.
      */

    /** Yukardkai Dezavantjıda aşağıdaki şekilde çözmüş oluyoruz.
     * synchronized ekleyerek multitreah işlemlerde ilk gelenin işi bitince ikinci içeriye almış oluyor. Her gelen thread kuyruk oluşturmuş oluyor.
     * Ama bunun da bir deavavantajı var. Lock oluşmasına sebebiyet verebilir ve metodun çalışmasını büyük ölçüde yavaşlatıyor.
     * **/

    public static LazySingleton getInstance2(){
        synchronized (LazySingleton.class){
            if(singleton == null){
                singleton = new LazySingleton();
            }
        }

        return singleton;
    }


}
