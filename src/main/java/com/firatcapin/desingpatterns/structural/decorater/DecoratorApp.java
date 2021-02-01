package com.firatcapin.desingpatterns.structural.decorater;

public class DecoratorApp {
    public static void main(String[] args) {
        String icerik = getRaporIcerik();

        String metin = DuzRaporCiktisi(icerik);

        System.out.println("Düz Rapor : " + metin);

        System.out.println("*********");

        DuzRapor duzRapor= new DuzRapor(icerik);
        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);
        String cizgilimetin = cizgiliRaporDecorator.getMetin();
        System.out.println("Cizgili Rapor : " + cizgilimetin);

        System.out.println("*********");

        KucukRaporDecorator kucukRaporDecorator = new KucukRaporDecorator(cizgiliRaporDecorator);
        String kucukRaporMetin = kucukRaporDecorator.getMetin();
        System.out.println("Kucuk Rapor Metin :" + kucukRaporMetin);
    }

    private static String DuzRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        return duzRapor.getMetin();
    }

    private static String getRaporIcerik() {
        String icerik = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. \n" +
                "\nLorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak " +
                "\nüzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı " +
                "\nsahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, " +
                "\naynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da " +
                "\niçeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi " +
                "\nLorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";

        return icerik;
    }
}
