package com.firatcapin.desingpatterns.creatianol.singleton;


public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){

    }

    /** LazySinleton dan tek farkı multithread sorunu çözmek için synchronized yapılması
     * Multithread ile çalışacağım demek içi synchronized yapılmış.
     * Birinci gelenin iş bitince ikinci nesne oluşmaya başlıyor böylece.
     * **/
    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (threadSafeSingleton == null)
            threadSafeSingleton = new ThreadSafeSingleton();
        return threadSafeSingleton;
    }

    public void singletonTest(){
        System.out.println("ThreadSafe Singleton method calisti");
    }
}
