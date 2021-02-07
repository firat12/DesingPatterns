package com.firatcapin.desingpatterns.behavioarol.memento;

public class NotepadMemento {
    //Bir nesnenin memento durumu için hafıza almak istediği nesnenin bir  kopyası olmalıdır.
    private String metin;

    public NotepadMemento() {
        metin = "";
    }

    public NotepadMemento(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }
}
