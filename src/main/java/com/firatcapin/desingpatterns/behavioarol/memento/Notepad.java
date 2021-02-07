package com.firatcapin.desingpatterns.behavioarol.memento;

public class Notepad {
    private String metin;

    public Notepad() {
        metin = "";
    }

    public Notepad(String metin) {
        this.metin = metin;
    }


    public void ekle(String eklenekMetin){
        metin = metin + eklenekMetin;
    }

    // Bu işlem ile yeni bir NotepadMemento nesnesi oluşturuyoruz.
    //  yeni metni içine ekliyoruz.
    public NotepadMemento kaydet(){
        return new NotepadMemento(metin);
    }

    public void geriDon(NotepadMemento memento){
        metin = memento.getMetin();
    }

    public void yazdir(){
        System.out.println(metin);
    }
}
