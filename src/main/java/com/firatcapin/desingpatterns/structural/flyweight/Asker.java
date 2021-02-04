package com.firatcapin.desingpatterns.structural.flyweight;

public abstract class Asker {
    private MermiBoyutu mermiBoyutu;

    public Asker(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
    }

    public void atesEt(){
        Mermi mermi = new Mermi(mermiBoyutu);
        mermi.atesle();
    }

    // MermiFactory clasında oluşturduğumuz havuz mantıgıyla nesne oluşturuyoruz.
    // Böyle her ateş etme eyleminde mermi nesnesi oluşturulurken ki kaybedilen zaman kaybının önüne geçmiş oluyoruz.
    public void atesEt2(){
        Mermi mermi = MermiFactory.mermiUret(mermiBoyutu);
        mermi.atesle();
    }

    public void tara(){
        for(int i=0;i < 5; i++){
            atesEt();
        }
    }
}
