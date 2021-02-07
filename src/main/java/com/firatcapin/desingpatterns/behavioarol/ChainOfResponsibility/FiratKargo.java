package com.firatcapin.desingpatterns.behavioarol.ChainOfResponsibility;

public class FiratKargo {

    public static KargoSirketi getKargoSirketi(){
        CankiriSube cankiriSube = new CankiriSube();
        AnkaraSube ankaraSube = new AnkaraSube();
        IstanbulSube istanbulSube = new IstanbulSube();
        AntalyaSube antalyaSube = new AntalyaSube();

        // Kargo şirketinin kendince belirlediği zincir.
        // Aşağıdaki şubelere gden kargoları alırım ama aşağıdaki şubelerin dışınd aolan kargoları almaz.
        KargoSirketi firatKargo = cankiriSube.setSonrakiKargoSirketi(
                ankaraSube.setSonrakiKargoSirketi(
                        istanbulSube.setSonrakiKargoSirketi(antalyaSube)
                        )
                );
        return firatKargo;
    }
}


