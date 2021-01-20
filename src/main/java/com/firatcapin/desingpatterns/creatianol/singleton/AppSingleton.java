package com.firatcapin.desingpatterns.creatianol.singleton;

public class AppSingleton {
    public static void main(String[] args) {
         /** Singleton : İlgili Nesneden bir tane oluşturmak istediğimizde bu tasaırm kalıbını kullanıyoruz. **/

        /** Nesneyi bu şekilde çağıramıyoruz. Private bir constructor olduğu için **/
         // Singleton singleton = new Singleton();

        /** Bu şekilde çağırıyoruz. **/
        //Singleton singleton = Singleton.getSingleton();
        /** Aşağıdkai gibi for işlemi yaptıralım
         * Nesne static olduğu ilk yapılandırıldığında oluşur tek seferlik.
         * **/
        for (int i=0;i<=10;i++){
            Singleton singleton2 = Singleton.getSingleton();
            System.out.println(i);
        }

        /** Yukardaki işlemin bir deazavantajı var. Nesne kullanılmadığı halde static tanımlandığı için heap da bir yer edinmiş oluyor.
         * Bu işleme Eager loading denir. İhtiyaç duymadığımız halde oluşuyor.
         */

    }
}
