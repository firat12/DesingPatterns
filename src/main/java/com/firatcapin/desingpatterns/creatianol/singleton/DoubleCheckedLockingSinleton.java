package com.firatcapin.desingpatterns.creatianol.singleton;

public class DoubleCheckedLockingSinleton {
    private static DoubleCheckedLockingSinleton singleton;

    private DoubleCheckedLockingSinleton(){
        System.out.println("Double Checked Locking Sinleton Singleton ile oluşturuldu.");
    }


    /** AppLazySinleton işleminde ki lock oluşma sorununu şu şekidle çözebiliriz.
     * synchronized öncesi nesne durumunu kontrol edip sonraısnda nesneyi oluşturabilİriz.
     * Böylece Max performasnlı bir nesne oluşturmuş olduk.
     * **/

    public static DoubleCheckedLockingSinleton getInstance3(){
        if(singleton == null){
            synchronized (LazySingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckedLockingSinleton();
                }
            }
        }

        return singleton;
    }
}
