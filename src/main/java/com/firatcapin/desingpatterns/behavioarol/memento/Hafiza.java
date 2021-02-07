package com.firatcapin.desingpatterns.behavioarol.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hafiza {
    private List<NotepadMemento> list;

    public Hafiza(){
        list = new ArrayList<>();
    }

    public void ekle(NotepadMemento memento){
        list.add(memento);
    }

    public NotepadMemento sonVersionGetir(){
        if(!list.isEmpty()){
            NotepadMemento sonversion = list.get(list.size() - 1);
            list.remove(sonversion);
            return sonversion;
        }else {
            throw  new ArrayIndexOutOfBoundsException("Yüklü Version Bulunamadı");
        }
    }
}
