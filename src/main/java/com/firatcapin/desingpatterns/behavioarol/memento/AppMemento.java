package com.firatcapin.desingpatterns.behavioarol.memento;

public class AppMemento {
    public static void main(String[] args) {
        Hafiza hafiza = new Hafiza();
        Notepad notepad = new Notepad();

        notepad.ekle("A");
        notepad.ekle("B");
        notepad.ekle("C");
        notepad.ekle("D");

        versionKaydet(hafiza, notepad);
        NotepadMemento alfabe;

        notepad.ekle("E");
        versionKaydet(hafiza,notepad);

        notepad.ekle(".");
        notepad.yazdir();

        geriAl(hafiza, notepad);
        versionKaydet(hafiza,notepad);

        notepad.ekle(" ÇAPIN");
        versionKaydet(hafiza,notepad);
        geriAl(hafiza, notepad);
        geriAl(hafiza, notepad);
        geriAl(hafiza, notepad);
        geriAl(hafiza, notepad); // burada hata verecek. Çünkü yüklü version yok.

    }

    private static void geriAl(Hafiza hafiza, Notepad notepad) {
        notepad.geriDon(hafiza.sonVersionGetir());
        notepad.yazdir();
    }

    private static void versionKaydet(Hafiza hafiza, Notepad notepad) {
        NotepadMemento alfabe = notepad.kaydet();
        hafiza.ekle(alfabe);
        notepad.yazdir();
    }
}
