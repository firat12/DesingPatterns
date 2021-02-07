package com.firatcapin.desingpatterns.behavioarol.ChainOfResponsibility;

public abstract class KargoSirketi {
    //Diğer tüm kargo şirkerleri burayı kullanacağı için absrtact yapıyoruz.
    private EnumIl enumIl;
    private KargoSirketi sonrakiKargoSirketi;

    public KargoSirketi(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public EnumIl getEnumIl() {
        return enumIl;
    }

    public KargoSirketi getSonrakiKargoSirketi() {
        return sonrakiKargoSirketi;
    }

    public KargoSirketi setSonrakiKargoSirketi(KargoSirketi sonrakiKargoSirketi) {
        this.sonrakiKargoSirketi = sonrakiKargoSirketi;
        return this;
    }

    public void kargola(EnumIl il) {
        gelenKargoBilgileriYazdir(il);

        if(getEnumIl().equals(il)){
            kargoTeslimSubeYazdir(il);
        }else if(getSonrakiKargoSirketi() != null){
            getSonrakiKargoSirketi().kargola(il);
        }else {
            hizmetAlanDisiYazdir(il, " Sistemin dışında bir ile kargo gidecek.");
        }
    }


    private void hizmetAlanDisiYazdir(EnumIl il, String s) {
        System.out.println(il.getIl() + s);
    }

    private void kargoTeslimSubeYazdir(EnumIl il) {
        System.out.println(il.getIl() + " şube teslim adlık.");
    }

    private void gelenKargoBilgileriYazdir(EnumIl il) {
        System.out.println(il.getIl() + " ilin gidecek kargo" + getEnumIl().getIl() + " Şubesne geldi.");
    }
}
