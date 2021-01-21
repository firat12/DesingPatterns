package com.firatcapin.desingpatterns.creatianol.singleton;


public class SingletonRun {
    public static void main(String[] args) {


    /** Eager Initialization İşlemi
     Bu işlemde her defasında nesneye ulaşmak için tekrar
     new etmeden bu nesenin getInstance metodunu çağırarak oluşturabiliriz.
     Ve bu metod çağırarak istediğimiz nesneye ulaşabilir.z
     Ama bunu bir dezavantajı var. static final tanımlandığı için ihtiyç
     duymadığım halde uygulma her yüklendiğin tekrardan instance oluşturulacak.
     Bunun oluşturulması ,hafıza durması bir maliyettir.
     **/
     EagerInitializationSingleton.getInstance().singletonTest();

     /** Yuakrda işlem ile bi benzerlik gösteriyor.Static tanımlandığı için.
      *  Bu işlem heap da bu instancelerı bekletiyor. Yuakrdaki ile benzer dezavantajı var.
      *  Kullanmadığı halde herşeyden önce yükleniliyor static oldukları için.
      */
     StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

    /** Bunun problemi birden fazla thread bu nesneye ulaşmaya çlışırsa ,
     * runtime yani lock oluşturacak. Multithread yapılarda tavsiye edilmez.
     * Ayrıca uygulama ayağa kalkar kalkmaz hemen oluşması bizim için bir sıkıntı.
     */
     LazySingleton.getLazySingleton().singletonTest();


     /** Bunun dezvantajı her defasında instance oluşturuken zaman kaybediyor.
      * Bu da karşımıza zaman maliyetini çıkarmış oluyor.
      */
     ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();

     /** Bu class ne zman ihtiyaç  duyularsa bu class o zaman jvm e yüklenir.
      * BÖYLECE gereksiz yere heap da yer edinmş olmaz.
      * En büyük avantajı loaadingtime kazandırması.
      */
     BillPughSingleton.getInstance().singletonTest();

    }
}
